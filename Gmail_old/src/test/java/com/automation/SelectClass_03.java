package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass_03 {

		public static void main(String[] args)throws Exception {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
			driver.switchTo().frame("iframeResult");
			WebElement lstCars = driver.findElement(By.id("cars"));
			Thread.sleep(1000);
			Select select = new Select(lstCars);
			List<WebElement> list = select.getOptions();
			System.out.println(list.size());
			for(WebElement webElement : list){
			System.out.println("Drop down value " + webElement.getText());
			}
			Thread.sleep(1000);
			driver.quit();
		}
}
