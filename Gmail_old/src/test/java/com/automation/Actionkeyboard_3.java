package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionkeyboard_3 {

	public static void main(String[] args)throws Exception { 
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com");
		
		Thread.sleep(2000);

		WebElement userName = driver.findElement(By.name("userName"));
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(userName, "mercury").perform();
		
		Thread.sleep(1000);
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(1000);
		
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(1000);
		
		
		actions.sendKeys(Keys.TAB).perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		WebElement signIn = driver.findElement(By.name("login"));
		
		actions.click(signIn).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
