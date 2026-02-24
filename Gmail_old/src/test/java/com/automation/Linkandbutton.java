package com.automation;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkandbutton {

	public static void main(String[] args)throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cleartax.in/");
		
		Thread.sleep(2000);
		
		WebElement linkaboutus = driver.findElement(By.linkText("About us"));
		
		System.out.println(linkaboutus.getTagName());
		
		System.out.println(linkaboutus.getAttribute("href"));
		
		linkaboutus.click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		WebElement btninvest =driver.findElement(By.tagName("button"));
		
		System.out.println(btninvest.getTagName());
		
		System.out.println(btninvest.getAttribute("class"));

		btninvest.click();
		
		Thread.sleep(2000);
		
		TakesScreenshot screenshot =(TakesScreenshot)driver;
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\" + "selenium_" + new Date().getTime() + ".JPEG");
			
		FileHandler.copy(source, dest);
		
		driver.close();
		
		
		
		
		
	}

}
