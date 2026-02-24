package com.ebanking.masters;

import org.testng.annotations.Test;

public class BranchcreNG extends BaseNG{
	
	@Test(priority = 1)
	public void brnc() throws Exception {
		
		Lbi.Branchcre("hdfc08","indore gate","12345","INDIA","GOA","GOA");
		
		
	}
	
	
	
	

}
