package com.automation;

import java.io.File;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thepancard.com/");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\" + "Screenshot_" + new Date().getTime()+ ".JPEG");
		
		FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
		
		driver.quit();
		
	
	}

}
