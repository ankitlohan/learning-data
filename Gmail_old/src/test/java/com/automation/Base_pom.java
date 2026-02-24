package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_pom {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//page factory
		
		Data_pom RHP = PageFactory.initElements(driver, Data_pom.class);
		RHP.login();
		
	}

}
