package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPageFactory extends Testpage {

	WebDriver driver;

    public TestPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openURL() {
        driver.get("https://demoqa.com");
    }

    public void newTabe(String text) {
        searchBox.sendKeys(text);
        searchBtn.click();
    }

    public void clickSecondResult() {
        secondVideo.click();
    
    }
}
