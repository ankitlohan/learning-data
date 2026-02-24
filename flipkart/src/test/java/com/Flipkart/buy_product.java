package com.Flipkart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buy_product {

	public static void main(String[] args)throws Exception{
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8770020930");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Ank123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		Thread.sleep(1000);
		WebElement txtSource = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div"));
		Actions actions = new Actions(driver);
		actions.sendKeys(txtSource, "Hp laptop").perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentwindowid = it.next();
		String childtwindowid = it.next();
		driver.switchTo().window(childtwindowid);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentwindowid);
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.name("q"));
		Thread.sleep(1000);
		searchbox.click();
		Actions actions1 = new Actions(driver);
		actions1.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(1000);
		actions1.sendKeys(Keys.DELETE).perform();
		Thread.sleep(1000);
		actions1.sendKeys(txtSource, "iPhone11").perform();
		Thread.sleep(1000);
		actions1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/ul")).click();
		Thread.sleep(3000);		
		Set<String> handle1 = driver.getWindowHandles();
		Iterator<String> it1 = handle1.iterator();
		String parentwindowid1 = it1.next();
		String childtwindowid1 = it1.next();
		driver.switchTo().window(childtwindowid1);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
		Actions actions4 = new Actions(driver);
		actions4.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div[2]")).click();
		Thread.sleep(8000);
		driver.close();
		driver.switchTo().window(parentwindowid1);
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		
	}

}
