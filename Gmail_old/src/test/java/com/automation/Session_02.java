package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_02 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.id("inputUsername"));
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		element.sendKeys("ankit");
		System.out.println(element.getAttribute("placeholder"));
		element.clear();
		org.openqa.selenium.Point point = element.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		Dimension dimension = element.getSize();
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());
		Rectangle rectangle = element.getRect();
		System.out.println(rectangle.getDimension());
		System.out.println(rectangle.getPoint());
		driver.quit();
	}

}
