package com.automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.linkText("Show Alert"));
		element.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(500);
		WebElement element1 = driver.findElement(By.linkText("Show Prompt"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		element1.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("ankit");
		String message = alert.getText();
		System.out.println(message);
		alert.accept();
		Thread.sleep(500);
		WebElement element2 = driver.findElement(By.linkText("Show Confirm"));
		element2.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		
	}

}
