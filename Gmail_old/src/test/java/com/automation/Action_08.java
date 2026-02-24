package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_08 {
	
	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.apsrtconline.in/oprs-web/");
		Thread.sleep(2000);
		WebElement txtSource = driver.findElement(By.name("source"));
		Actions actions = new Actions(driver);
		actions.sendKeys(txtSource, "HYDERA").perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.ENTER).perform();
		WebElement txtDestination = driver.findElement(By.name("destination"));
		actions = new Actions(driver);
		actions.sendKeys(txtDestination, "VIJAYA").perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
