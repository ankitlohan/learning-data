package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass_05 {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement lstCars = driver.findElement(By.id("cars"));
		Thread.sleep(1000);
		Select select = new Select(lstCars);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("audi");
		Thread.sleep(1000);
		select.selectByVisibleText("Saab");	
		Thread.sleep(1000);
		WebElement element = select.getFirstSelectedOption();
		System.out.println(element.getText());
		driver.quit();
		
	}

}
