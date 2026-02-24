package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Table6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		WebElement cell = driver.findElement(By.xpath("((((//table)[1]//tr)[2])//td)[4]"));
		
		System.out.println("2nd Row 4th Column Content:" + cell.getText());
		
		cell = driver.findElement(By.xpath("((((//table)[1]//tr)[10])//td)[3]"));
		
		System.out.println("10th Row 3rd Column Content:" + cell.getText());
		
		driver.quit();
	}

}
