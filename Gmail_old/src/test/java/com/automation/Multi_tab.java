package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_tab {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}
}
