package com.demo.framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageFactory extends TestPage {

    WebDriver driver;
    WebDriverWait wait;

    public TestPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static WebDriver setUpDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public void openApplication() {
        driver.get("https://demoqa.com");
    }

    public void clickElements() {
        elementsLink.click();
    }

    public void openTextBox() {
        textBoxMenu.click();
    }

    public void fillTextBox() {

        userName.sendKeys("ankit lohan");
        userEmail.sendKeys("ankit@gmail.com");
        currentAddress.sendKeys("xyz");
        permanentAddress.sendKeys("xyz");
        submitBtn.click();

        // ✅ Assertion for Name Output
        String actualName = driver.findElement(By.id("name")).getText();
        String expectedName = "Name:ankit lohan";

        Assert.assertEquals(actualName, expectedName, "TextBox Assertion Failed");
    }

    public void CheckBox() {

        wait.until(ExpectedConditions.elementToBeClickable(checkBoxMenu));
        checkBoxMenu.click();
    }

    public void openCheckBox() {

    	wait.until(ExpectedConditions.elementToBeClickable(homeExpand));
        homeExpand.click();

        wait.until(ExpectedConditions.elementToBeClickable(desktopExpand));
        desktopExpand.click();

        wait.until(ExpectedConditions.elementToBeClickable(documentExpand));
        documentExpand.click();

        wait.until(ExpectedConditions.elementToBeClickable(downloadExpand));
        downloadExpand.click();
    }
    
    public void selectCheckBox() {

    	wait.until(ExpectedConditions.elementToBeClickable(selectNotes));
    	selectNotes.click();

       
    }
    
    
    
    
    
    
}