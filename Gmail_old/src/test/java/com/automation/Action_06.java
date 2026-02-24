package com.automation;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_06 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions = new Actions(driver);
		//perform right click action
		actions.contextClick(rightClick).perform();
		Thread.sleep(1000);
		//take screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sor = screenshot.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\" + "rightClick_ " + new Date().getTime() + ".png");
		FileHandler.copy(sor, des);
		System.out.println(des.getAbsolutePath());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//double click element
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//double click actions
		actions.doubleClick(doubleClick).perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		TakesScreenshot screenshot1 = (TakesScreenshot)driver;
		File sor1 = screenshot1.getScreenshotAs(OutputType.FILE);
		File des1 = new File("D:\\" + "rightClick_ " + new Date().getTime() + ".png");
		FileHandler.copy(sor1, des1);
		System.out.println(des1.getAbsolutePath());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
	}
}
