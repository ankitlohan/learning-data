package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class text_field_test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://way2sms.com/");
		
		Thread.sleep(1000);
		
		WebElement text = driver.findElement(By.id("mobileNo"));

		System.out.println(text.isDisplayed());
		
		System.out.println(text.isEnabled());
		
		text.sendKeys("1234567890");
		
		System.out.println(text.getAttribute("value"));
		
		Thread.sleep(1000);
		
		text.clear();
		
		org.openqa.selenium.Point point = text.getLocation();
		
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		org.openqa.selenium.Dimension dimension = text.getSize();
		
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());
		
		Rectangle rectangle = text.getRect();
		
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getX());
		System.out.println(rectangle.getY());
		
		
	}

}
