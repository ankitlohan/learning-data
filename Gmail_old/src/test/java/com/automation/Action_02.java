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

public class Action_02 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(0);
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement destinaton = driver.findElement(By.id("droppable"));
			Actions actions = new Actions(driver);
			actions.dragAndDrop(source, destinaton);
			Thread.sleep(1000);
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File sos = screenshot.getScreenshotAs(OutputType.FILE);
			File des = new File("D:\\" + "ss" + new Date().getTime() + ".png");
			FileHandler.copy(sos, des);
			System.out.println(des.getAbsolutePath());
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			driver.quit();
		}
	}

}
