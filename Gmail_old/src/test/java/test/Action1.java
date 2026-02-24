package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 {

	public static void main(String[] args)throws Exception{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		Thread.sleep(2000);
		
		WebElement txtSource = driver.findElement(By.name("source"));
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(txtSource, "HYDERABAD").perform();
		
		Thread.sleep(8000);
		
		actions.click(driver.findElement(By.xpath("//*[text()='HYDERABAD']"))).perform();
		Thread.sleep(2000);
		
		WebElement txtDestination = driver.findElement(By.name("destination"));
		
		actions = new Actions(driver);
		
		actions.sendKeys(txtDestination, "VIJAYAWADA").perform();
		
		Thread.sleep(2000);
		
		actions.click(driver.findElement(By.xpath("//*[text()='VIJAYAWADA']"))).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
