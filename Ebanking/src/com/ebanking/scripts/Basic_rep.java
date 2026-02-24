package com.ebanking.scripts;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_rep {

	public static void main(String[] args)throws Exception {
		
		FileInputStream fil = new FileInputStream("D:\\Selenium live project\\workspacenew\\Ebanking\\src\\com\\ebanking\\properties\\Rep.properties");
		Properties pr=new Properties();
		pr.load(fil);
		
		WebDriver driver = new FirefoxDriver();
	 
		driver.manage().window().maximize();
	 
		driver.get(pr.getProperty("url"));
	 
		Thread.sleep(2000);
	 
		driver.findElement(By.id(pr.getProperty("Uname"))).sendKeys("Admin");
	 
		driver.findElement(By.id(pr.getProperty("Pswd"))).sendKeys("admin123");
		
		Thread.sleep(2000);	
		
		driver.findElement(By.id(pr.getProperty("Login"))).click();

		Thread.sleep(3000);

		driver.quit();
			
	}
}
