package com.automation;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowmanage {

	 public static void main(String[] args) throws Exception {

     WebDriverManager.chromedriver().setup();  
    
     WebDriver driver = new ChromeDriver();
     
     driver.manage().window().maximize();
     
     FileInputStream Fis =new FileInputStream("C:\\Users\\hp\\Desktop\\Role.xlsx");
     
		XSSFWorkbook WB = new XSSFWorkbook(Fis);
		XSSFSheet WS = WB.getSheet("Ldata1");
		
		int RC=WS.getLastRowNum();
		System.out.println(RC);

		
		for(int i=1; i<=RC; i++ )
		{
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
		
			//cell
			
			XSSFCell WC=WR.getCell(0);
			
			//cell values
			
			String URL=WC.getStringCellValue();
			
			driver.get(URL);
			driver.switchTo().newWindow(WindowType.WINDOW);
			Thread.sleep(500);
		}
		System.out.println("pass");
    
     driver.quit();

		
	 }

}
