package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic_enhacment {

	public static void main(String[] args)throws Exception {
		
        String Expval="Ranford Bank";
		
		//Launch Browser
		
		WebDriver driver=new ChromeDriver();
		
		//Url
		
		driver.get("http://122.175.8.158/ranford2");
		
		//Maximise
		
		driver.manage().window().maximize();
		
		String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Ranford Application Launch Succ");	
		}
		else
		{
			System.out.println("Ranford Application Not Launch");	
		}

		
		String Tit=driver.getTitle();
		System.out.println(Tit);
		
		//Admin login
		
		Expval="Welcome to Admin";
		Thread.sleep(3000);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
				if (Expval.equalsIgnoreCase(Actval)) 
				{
				System.out.println("Admin Login Succ");	
				}
				else
				{
					System.out.println("Admin Login Failed");	
				}
				
		
		//Branches
		
		Expval="Sucessfully";		
				
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		
		driver.findElement(By.id("txtbName")).sendKeys("hdfc08");
		driver.findElement(By.id("txtAdd1")).sendKeys("indore gate");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		
		//dropdown
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		Select Sta=new Select(driver.findElement(By.id("lst_stateI")));
		Sta.selectByVisibleText("GOA");

		Select Cty=new Select(driver.findElement(By.id("lst_cityI")));
		Cty.selectByVisibleText("GOA");

		driver.findElement(By.id("btn_insert")).click();
		
		Thread.sleep(4000);
		
		//Alert
		
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		//Comparision
		
		if (Actval.contains(Expval)) 
		{
		System.out.println("Branch Created");	
		}
		else
		{
			System.out.println("Branch Already Exist");
		}

		//Home button
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
		
		//Role creation
		
		Expval="Sucessfully";
		
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.id("btnRoles")).click();
		
		driver.findElement(By.id("txtRname")).sendKeys("anit");
		Select role= new Select(driver.findElement(By.id("lstRtypeN")));
		role.selectByVisibleText("E");
		Thread.sleep(2000);
		
		//submit
		driver.findElement(By.id("btninsert")).click();
		Thread.sleep(2000);
		
		//alert
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Comparision
		
				if (Actval.contains(Expval)) 
				{
				System.out.println("Role Created");	
				}
				else
				{
					System.out.println("Role Already Exist");
				}
		
		//Home button
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
		
		//user creation
		
		Expval="Sucessfully";
		
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[6]/td/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Btnuser\"]")).click();
		
		Select rol=new Select(driver.findElement(By.id("lst_Roles")));
		rol.selectByVisibleText("icustomer");
		Select branch1=new Select(driver.findElement(By.id("lst_Branch")));
		branch1.selectByVisibleText("hdfc08");
		driver.findElement(By.id("Lbc_name")).sendKeys("rachita");
		driver.findElement(By.id("txtUname")).sendKeys("pancholi");
		driver.findElement(By.id("txtLpwd")).sendKeys("ankit123");
		driver.findElement(By.id("txtTpwd")).sendKeys("ankit0809");
		
		//submit
		driver.findElement(By.id("BtnSubmit")).click();
		Thread.sleep(1000);
		
		//alert
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		//Comparision
		
				if (Actval.contains(Expval)) 
				{
				System.out.println("User Created");	
				}
				else
				{
					System.out.println("User Already Exist");
				}
		
		//Home button
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();

		//emp creation
		
		Expval="Sucessfully";
		
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		driver.findElement(By.id("BtnNew")).click();
		
		driver.findElement(By.id("txtUname")).sendKeys("khusal");
		driver.findElement(By.id("txtLpwd")).sendKeys("ankit08");
		Select roles = new Select(driver.findElement(By.id("lst_Roles")));
		roles.selectByVisibleText("anit");
		Select bch = new Select(driver.findElement(By.id("lst_Branch")));
		bch.selectByVisibleText("hdfc08");
		Thread.sleep(1000);
		
		//submit
		driver.findElement(By.id("BtnSubmit")).click();
		Thread.sleep(1000);
		
		//Alert
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		//Comparision
		
				if (Actval.contains(Expval)) 
				{
				System.out.println("Emp Created");	
				}
				else
				{
					System.out.println("Emp Already Exist");
				}
		
		//Home button
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
		
		//Log out
		driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr/td[3]/a/img")).click();
		
		//close Application
		driver.quit();
		
	}

}
