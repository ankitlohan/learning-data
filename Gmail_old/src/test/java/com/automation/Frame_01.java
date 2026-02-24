package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_01 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		driver.switchTo().frame(0);
		//driver.switchTo().frame("value");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
