package com.automation;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import groovyjarjarantlr4.v4.parse.ANTLRParser.throwsSpec_return;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	static WebDriver driver;
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void waitSetUp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	public static void openApplication() {
	        driver.get("https://demoqa.com");
	        System.out.println("Application Launched");
	}
	public static void elemnts() throws Exception{
		 driver.findElement(By.xpath("//a[@href='/elements']")).click();
		 System.out.println("First Module open Element");
	}
	public static void firstModule() throws Exception{
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		 System.out.println("First Text Box");
	}
	public static void text() {
		driver.findElement(By.id("userName")).sendKeys("ankit lohan");
		driver.findElement(By.id("userEmail")).sendKeys("ankit@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("xyz");
		driver.findElement(By.id("permanentAddress")).sendKeys("xyz");
		driver.findElement(By.id("submit")).click();
		
		System.out.println("Text box Done");
	}
	public static void secondModule() {
		 driver.findElement(By.xpath("//*[@href='/checkbox']")).click();
		 System.out.println("Second Check Box");
	}
	public static void checkBox(){
		driver.findElement(By.xpath("//span[text()='Home'] /../..//span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
		driver.findElement(By.xpath("//span[text()='Desktop'] /../..//span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
		driver.findElement(By.xpath("//span[text()='Documents'] /../..//span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
		driver.findElement(By.xpath("//span[text()='Downloads'] /../..//span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();

		driver.findElement(By.xpath("//span[text()='Notes'] /../..//span[@class='rc-tree-checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='Commands'] /../..//span[@class='rc-tree-checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='WorkSpace'] /../..//span[@class='rc-tree-checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='Office'] /../..//span[@class='rc-tree-checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='Word File.doc'] /../..//span[@class='rc-tree-checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='Excel File.doc'] /../..//span[@class='rc-tree-checkbox']")).click();
	}
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		
		try {
			setUp();
			waitSetUp();
			openApplication();
			elemnts();
			firstModule();
			text();
			secondModule();
			checkBox();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			//driver.quit();
		}
	}
}