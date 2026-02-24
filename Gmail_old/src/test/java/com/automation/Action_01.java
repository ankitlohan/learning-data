package com.automation;

import java.io.File;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_01 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
			driver.switchTo().frame("iframeResult");
			WebElement element = driver.findElement(By.xpath("//button[text()='Try it']"));
			Actions action = new  Actions(driver);
			//
			WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//Explicit click wait
			driverWait.until(ExpectedConditions.elementToBeClickable(element));
			action.click(element).build().perform();
			Thread.sleep(500);
			Alert alert = driver.switchTo().alert();
			//Explicit alert wait
			driverWait.until(ExpectedConditions.alertIsPresent());
			alert.sendKeys("Ankit");
			alert.accept();
			//screenshot
			TakesScreenshot  screenshot = (TakesScreenshot)driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\" + "Alert_" + new Date().getTime() + ".png");
			FileHandler.copy(source, destination);
			System.out.println(destination.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
		
}


}
