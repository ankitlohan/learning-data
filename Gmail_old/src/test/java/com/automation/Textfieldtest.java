package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textfieldtest {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.way2sms.com/");
		
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.id("mobileNo"));
		
		System.out.println(text.isDisplayed());

		System.out.println(text.isEnabled());
		
		text.sendKeys("8770020");
		
		System.out.println(text.getAttribute("value"));
		
		Thread.sleep(2000);
		
		text.clear();
		
		Point point = text.getLocation();
		
		System.out.println(point.getX());
		
		System.out.println(point.getY());
		
		Dimension dimension = text.getSize();
		
		System.out.println(dimension.getHeight());
		
		System.out.println(dimension.getWidth());
		
		Rectangle rectangle = text.getRect();
		
		System.out.println(rectangle.getX());
		
		System.out.println(rectangle.getY());
		
		System.out.println(rectangle.getHeight());
		
		System.out.println(rectangle.getWidth());
		
		driver.quit();
		

	}

}
