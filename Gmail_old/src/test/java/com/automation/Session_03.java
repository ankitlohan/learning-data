package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_03 {
	
	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.name("radioButton"));
		Thread.sleep(500);
		element.click();
		System.out.println(element.isSelected());
		WebElement element1 = driver.findElement(By.cssSelector("input[value='radio2']"));
		Thread.sleep(500);
		element1.click();
		System.out.println(element1.isSelected());
		WebElement element2 = driver.findElement(By.xpath("//input[@value='radio3']"));
		Thread.sleep(500);
		element2.click();
		System.out.println(element2.isSelected());
	}

}
