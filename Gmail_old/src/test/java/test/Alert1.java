package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Show Alert")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Show Confirm")).click();
		Thread.sleep(1000);
		alert.dismiss();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Show Prompt")).click();
		Thread.sleep(1000);
		alert.sendKeys("Suniti ankit lohan");
		alert.accept();
		Thread.sleep(1000);
		driver.quit();	
		
	}

}
