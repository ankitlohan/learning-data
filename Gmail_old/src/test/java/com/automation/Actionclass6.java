package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass6 {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dtdc.in/");
		
		Thread.sleep(3000);
		
		WebElement btnClose =driver.findElement(By.id("closebutton"));
		
		btnClose.click();
		
		Thread.sleep(2000);
		
		WebElement lnkTracking= driver.findElement(By.linkText("Tracking"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(lnkTracking).perform();
		
		Thread.sleep(2000);
		
		WebElement lnkETracker = driver.findElement(By.linkText("E-Tracker"));
		
		actions.click(lnkETracker).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
