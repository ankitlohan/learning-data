package com.automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Table3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		List<WebElement> cells = driver.findElements(By.xpath("(//table)[1]//th|(//table)[1]//td"));
		
		System.out.println("Number Of cells:" + cells.size());
		
		driver.quit();
	}

}
