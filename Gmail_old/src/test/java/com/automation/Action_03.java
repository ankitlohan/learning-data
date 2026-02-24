package com.automation;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_03 {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(0);
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			Actions actions = new Actions(driver);
			actions.clickAndHold(source).perform();
			actions.release(target).perform();
			Thread.sleep(2000);
			TakesScreenshot  screenshot = (TakesScreenshot)driver;
			File sourc = screenshot.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\" + "Alert_" + new Date().getTime() + ".png");
			FileHandler.copy(sourc, destination);
			System.out.println(destination.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
}

}
