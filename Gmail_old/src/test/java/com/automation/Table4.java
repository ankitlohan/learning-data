package com.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Table4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		WebElement table = driver.findElement(By.xpath("(//table)[1]"));
		
		System.out.println(table.getText());
		
		driver.quit();
	}

}
