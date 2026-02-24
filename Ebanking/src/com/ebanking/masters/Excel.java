package com.ebanking.masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws  IOException, InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		//to get the Excel File
		
		FileInputStream Fis =new FileInputStream("C:\\Users\\hp\\Desktop\\Role.xlsx");

		//Workbook
		
		XSSFWorkbook WB = new XSSFWorkbook(Fis);
		
		//Sheet
		
		XSSFSheet WS = WB.getSheet("Ldata");
		
		//Row count
		
		int RC=WS.getLastRowNum();
		
		System.out.println(RC);
		
		//Multiple Iteration............Forloop
		
		for(int i=1; i<=RC; i++ )
		{
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//cell values
			
			String UN=WC.getStringCellValue();
			
			String pwd=WC1.getStringCellValue();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).clear();

			driver.findElement(By.id("txtUsername")).sendKeys(UN);
			
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			Thread.sleep(3000);
			

			
			Thread.sleep(1000);
			
			WC2.setCellValue("pass");
		}
			//result
			
			FileOutputStream fos= new FileOutputStream("C:\\Users\\hp\\Desktop\\Roleresults.xlsx");
			WB.write(fos);
			WB.close();
			
			//close
			driver.quit();
			
		
	}

}
