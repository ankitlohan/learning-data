package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass7 {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(element).perform();
		
		WebElement txtCopy = driver.findElement(By.xpath("//span[text()='Copy']"));
		
		actions.click(txtCopy).build().perform();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
