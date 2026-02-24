package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass4 {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		WebElement slider= driver.findElement(By.xpath("//div[@id='slider']//span"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDropBy(slider, 300, 0).perform();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
