package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://samsung-space.sprinklr.com/care/insights/reporting/dashboard/60caf56640f7bc46c9930ce5/tab/3");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("ankit.bhardwaj@maxicus.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(" Samsung@123");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(80000);

		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/section/div[2]/div[1]/div[1]/main/div/section/section/div/section/section/section/div/div/div/div/div/div[19]/article/div[1]/div/div/header/div/div[2]/button[4]")).click();
		Thread.sleep(35000);

		driver.findElement(By.xpath("//button[position()=4]/.")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//li[.='Time and Time Zone Filter']/.")).click();
		Thread.sleep(8000);

//		DateFormat dateFormat = new SimpleDateFormat("dd");
//
//		// get current date time with Date()
//		Date date = new Date();
//
//		// Now format the date
//		String date1 = dateFormat.format(date);
//
//		String month = "September";
//		driver.findElement(By.xpath("//button[normalize-space()='September']//*[name()='svg']")).click();
//
////	        String text = driver. findElement(By.xpath("//button[@aria-live='polite']/..")).getText();
////	        System.out.print(text);
//
//		while (true) {
//			String text = driver.findElement(By.xpath("//button[normalize-space()='September']")).getText();
//			Thread.sleep(3000);
//			 System.out.print(text);
//
//			if (text.equals(month)) {
//				break;
//			} else {
//				driver.findElement(By.xpath("(//button[@aria-label='Next month.'])[2]"));
//			}
//		}
//
//		driver.findElement(By.xpath("(//div[@role='grid'])[2] //div[contains(text(),'20')]")).click();
//		Thread.sleep(3000);
//
//		// System.out.println(date1);
		driver.quit();
	}

}
