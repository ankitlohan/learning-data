package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args)throws Exception{
			
			
				//Launch Browser
				
				WebDriver driver=new FirefoxDriver();
				
				//Url
				
				driver.get("http://122.175.8.158/ranford2");
				
				//Maximise
				
				driver.manage().window().maximize();
				
				//Admin login
				
				driver.findElement(By.id("txtuId")).sendKeys("Admin");
				driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
				driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
				Thread.sleep(2000);
				
				//Branches
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
				driver.findElement(By.id("BtnNewBR")).click();
				
				driver.findElement(By.id("txtbName")).sendKeys("hdfc08");
				driver.findElement(By.id("txtAdd1")).sendKeys("indore gate");
				driver.findElement(By.id("txtZip")).sendKeys("12345");
				Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
				Ctry.selectByVisibleText("INDIA");
				Select state=new Select(driver.findElement(By.id("lst_stateI")));
				state.selectByVisibleText("GOA");
				Select city=new Select(driver.findElement(By.id("lst_cityI")));
				city.selectByVisibleText("GOA");
				Thread.sleep(2000);
				
				//submit
				driver.findElement(By.id("btn_insert")).click();
				Thread.sleep(2000);
				
				//Alert
				driver.switchTo().alert().accept();
				
				//Home button
				driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
				
				//Role creation
				
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
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				
				//Home button
				driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
				
				//user creation
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
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				
				//Home button
				driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();

				//emp creation
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
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				
				//Home button
				driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
				
				//Log out
				driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr/td[3]/a/img")).click();
				
				//close Application
				driver.quit();
				
				
			}

		}


