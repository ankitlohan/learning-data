

package com.ebanking.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LibrayNG {

	 public static WebDriver driver;
	 
	public static String Expval,Actval;
	
	
	public void opnapp(String url) {
	
	Expval="Ranford Bank";
	
	//Launch Browser
	
	driver=new FirefoxDriver();
	
	//Url
	
	driver.get(url);
	
	//Maximise
	
	driver.manage().window().maximize();
	
	Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	
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
	
}

	
	 public void Adminlogin(String un,String pwd)throws Exception {
	
	Expval="Welcome to Admin";
	Thread.sleep(3000);
	driver.findElement(By.id("txtuId")).sendKeys(un);
	driver.findElement(By.id("txtPword")).sendKeys(pwd);
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
			
	
}

	
	 public void Branchcre(String bn,String add,String zip,String cnty,String sta,String city)throws Exception {

	Expval="Sucessfully";		
	
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.id("BtnNewBR")).click();
	
	
	driver.findElement(By.id("txtbName")).sendKeys(bn);
	driver.findElement(By.id("txtAdd1")).sendKeys(add);
	driver.findElement(By.id("txtZip")).sendKeys(zip);
	
	//dropdown
	
	Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
	Ctry.selectByVisibleText(cnty);
	
	Select Sta=new Select(driver.findElement(By.id("lst_stateI")));
	Sta.selectByVisibleText(sta);

	Select Cty=new Select(driver.findElement(By.id("lst_cityI")));
	Cty.selectByVisibleText(city);

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
	
}

	
	 public void Rolecrea(String na, String ro)throws Exception {


	Expval="Sucessfully";
	
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	driver.findElement(By.id("btnRoles")).click();
	
	driver.findElement(By.id("txtRname")).sendKeys(na);
	Select role= new Select(driver.findElement(By.id("lstRtypeN")));
	role.selectByVisibleText(ro);
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
	
	
}

	
	 public void Usercrea(String idd,String brc,String cna,String unm,String upd,String tpwd )throws Exception {
	
	Expval="Sucessfully";
	
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[6]/td/a/img")).click();
	driver.findElement(By.xpath("//*[@id=\"Btnuser\"]")).click();
	
	Select rol=new Select(driver.findElement(By.id("lst_Roles")));
	rol.selectByVisibleText(idd);
	Select branch1=new Select(driver.findElement(By.id("lst_Branch")));
	branch1.selectByVisibleText(brc);
	driver.findElement(By.id("Lbc_name")).sendKeys(cna);
	driver.findElement(By.id("txtUname")).sendKeys(unm);
	driver.findElement(By.id("txtLpwd")).sendKeys(upd);
	driver.findElement(By.id("txtTpwd")).sendKeys(tpwd);
	
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


}

	
	 public void empcrea(String uname,String lpwd,String rol, String bran)throws Exception {

	Expval="Sucessfully";
	
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
	driver.findElement(By.id("BtnNew")).click();
	
	driver.findElement(By.id("txtUname")).sendKeys(uname);
	driver.findElement(By.id("txtLpwd")).sendKeys(lpwd);
	Select roles = new Select(driver.findElement(By.id("lst_Roles")));
	roles.selectByVisibleText(rol);
	Select bch = new Select(driver.findElement(By.id("lst_Branch")));
	bch.selectByVisibleText(bran);
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
	
}

	
	 public void logout() {

	driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr/td[3]/a/img")).click();
	
}

	
	 public void close() {

	driver.quit();
	
}


	

	


	
}
