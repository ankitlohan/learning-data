package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		
		WebElement frame = driver.findElement(By.name("packageListFrame"));

		driver.switchTo().frame(frame);
		
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	
	}
	
}
