package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass1 {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Try it']"));
		
		Actions actions = new Actions(driver);
		
		actions.click(element).build().perform();
		
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("SRIKRISHNA");
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
	
	
}
