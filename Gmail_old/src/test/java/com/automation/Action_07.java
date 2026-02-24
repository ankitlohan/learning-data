package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_07 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		try {
			driver.get("https://www.goibibo.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/span/span")).click();
			Thread.sleep(1000);
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000);
			actions.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000);
			actions.sendKeys(Keys.PAGE_UP);
			Thread.sleep(1000);
			actions.sendKeys(Keys.PAGE_UP);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
		
		
	}

}
