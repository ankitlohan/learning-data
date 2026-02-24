package com.ebanking.masters;

import org.testng.annotations.Test;

public class Uercreation extends BaseNG{

	@Test(priority = 3)
	public void brnc() throws Exception {
		
		Lbi.Usercrea("icustomer","hdfc08","rachita","pancholi","ankit123","ankit0809");
		
		
	}
}
