package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame_4 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.xpath("//span[text()='CommandProcessor']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		WebElement thridFrame = driver.findElement(By.name("classFrame"));
		
		driver.switchTo().frame(thridFrame);

		driver.findElement(By.linkText("HttpCommandProcessor")).click();

		Thread.sleep(3000);
		
		driver.quit();
		
	
	}

}
