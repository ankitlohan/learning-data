package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RBCDtest {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/newpancard.php");
		
		Thread.sleep(2000);
		
		WebElement individual = driver.findElement(By.id("rblCategory_0"));
		
		individual.click();
		
		System.out.println(individual.isSelected());
		
		Thread.sleep(2000);

		WebElement army = driver.findElement(By.id("rblCategory_1"));
		
		army.click();
		
		System.out.println(army.isSelected());
		
		Thread.sleep(2000);

		WebElement navy = driver.findElement(By.id("rblCategory_2"));
		
		navy.click();
		
		System.out.println(navy.isSelected());
		
		Thread.sleep(2000);

		WebElement airforce = driver.findElement(By.id("rblCategory_3"));
		
		airforce.click();
		
		System.out.println(airforce.isSelected());
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
