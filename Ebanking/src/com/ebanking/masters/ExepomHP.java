package com.ebanking.masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExepomHP {

		@Test
		public void pom() {
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			//page factory
			
			RanfordHP RHP = PageFactory.initElements(driver, RanfordHP.class);
			RHP.login();
			
			
			
		}
	
	
	
	
	
	
	
}
