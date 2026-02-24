package com.ebanking.masters;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseNG {

	LibrayNG Lbi=new LibrayNG();
	
	  @BeforeTest
	  public void beforeTest() throws Exception 
	  {
	  Lbi.Adminlogin("Admin","M1ndq");
	  }

	  @AfterTest
	  public void afterTest() throws Exception 
	  {
	  Lbi.logout();
	  
	  }
	  
	  

	  @BeforeSuite
	  public void beforeSuite() throws IOException 
	  {
	  Lbi.opnapp("http://122.175.8.158/ranford2");
	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
	  Lbi.close();
	  }
}
