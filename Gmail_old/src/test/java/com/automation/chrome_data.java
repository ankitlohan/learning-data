package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome_data {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		
		String tittle = driver.getTitle();
		
		System.out.println(tittle);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		driver.quit();
		
		
	}

}
