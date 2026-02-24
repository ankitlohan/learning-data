package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_method {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankit.lohan\\Desktop\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().getPageLoadTimeout();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://way2sms.com/");
	
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement text = driver.findElement(By.id("mobileNo"));
		
		System.out.println(text.isDisplayed());
		
		System.out.println(text.isEnabled());
				
		text.sendKeys("9754820930");
		
		Thread.sleep(1000);
		
		text.clear();
		
		System.out.println(text.getAttribute("type"));
	
		Thread.sleep(1000);
		
		Point point = text.getLocation();
		
		System.out.println(point.getX());
		
		System.out.println(point.getY());
		
		Dimension dimension = text.getSize();
		
		System.out.println(dimension.getHeight());
		
		System.out.println(dimension.getWidth());
		
		Rectangle rectangle = text.getRect();
		
		System.out.println(rectangle.getX());
		
		System.out.println(rectangle.getY());
		
		System.out.println(rectangle.getHeight());
		
		System.out.println(rectangle.getWidth());
		
		driver.navigate().to("https://www.thepancard.com/newpancard.php");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl() );
		
		WebElement army = driver.findElement(By.id("rblCategory_1"));
		army.click();
		System.out.println(army.isSelected());
		
		WebElement navy = driver.findElement(By.id("rblCategory_2"));
		navy.click();
		System.out.println(navy.isSelected());
		
		WebElement airforce = driver.findElement(By.id("rblCategory_3"));
		airforce.click();
		System.out.println(airforce.isSelected());
		
		WebElement individual = driver.findElement(By.id("rblCategory_0"));
		individual.click();
		System.out.println(individual.isSelected());		
		
		driver.quit();
		
	}

}
