package com.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Table5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		WebElement row = driver.findElement(By.xpath("((//table)[1]//tr)[2]"));
		
		System.out.println("2nd Row Content:" + row.getText());
		
		row = driver.findElement(By.xpath("((//table)[1]//tr)[3]"));
		
		System.out.println("3rd Row Content:" + row.getText());
		
		driver.quit();
	}

}
