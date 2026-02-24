package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("body > header > nav > div.fixedNav > div.subNav > ul:nth-child(1) > li:nth-child(1) > a")).click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		}

}
