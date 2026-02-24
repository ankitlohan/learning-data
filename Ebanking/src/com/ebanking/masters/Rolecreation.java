package com.ebanking.masters;

import org.testng.annotations.Test;

public class Rolecreation extends BaseNG {

	@Test(priority = 2)
	public void rolc() throws Exception {
		
		Lbi.Rolecrea("anit", "E");
		
		
	}
}
