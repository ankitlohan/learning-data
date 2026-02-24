package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionkeyboard_2 {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(element).perform();
		
		actions.sendKeys(Keys.ARROW_DOWN).perform();

		Thread.sleep(1000);
		
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
		
		actions.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
