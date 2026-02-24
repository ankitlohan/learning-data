package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_Button_test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/newpancard.php");
		
		Thread.sleep(1000);
		
		WebElement rbarmy = driver.findElement(By.id("rblCategory_1"));
		
		System.out.println(rbarmy.isSelected());
		
		Thread.sleep(1000);
		
		WebElement rbnavy = driver.findElement(By.id("rblCategory_2"));
		
		System.out.println(rbnavy.isSelected());
		
		Thread.sleep(1000);
		
		WebElement rbforce = driver.findElement(By.id("rblCategory_3"));
		
		System.out.println(rbforce.isSelected());
		
		Thread.sleep(1000);
		
		WebElement indiviual = driver.findElement(By.id("rblCategory_0"));
		
		System.out.println(indiviual.isSelected());
		
		driver.quit();
		
	}

}
