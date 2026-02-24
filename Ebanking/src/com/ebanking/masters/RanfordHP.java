package com.ebanking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP {

	// Element properties
	
	@FindBy (id="txtUsername")
	WebElement uname;
	
	@FindBy (id="txtPassword")
	WebElement pwd;
	
	@FindBy (id="btnLogin")
	WebElement lgn;
	
	//Element Methods
	
	public void login() {
		
		uname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		lgn.click();
	}
	
	
	
	
	
	
}
