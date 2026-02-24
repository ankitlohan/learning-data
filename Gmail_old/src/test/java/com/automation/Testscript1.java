package com.automation;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testscript1 {

	WebDriver driver = null;

	@BeforeTest
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://electoralsearch.in/");

	}
	
	@Test
	public void selectState() {

		driver.findElement(By.id("continue")).click();

		WebElement lstStates = driver.findElement(By.id("nameStateList"));

		Select select = new Select(lstStates);

		select.selectByIndex(4);

	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
		
	}
	

}
