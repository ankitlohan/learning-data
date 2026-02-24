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

public class Action_04 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/slider/");
			driver.switchTo().frame(0);
			WebElement slider= driver.findElement(By.xpath("//div[@id='slider']//span"));
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(slider, 300, 0).perform();
			Thread.sleep(5000);
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
