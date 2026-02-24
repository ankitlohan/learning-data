package com.ebanking.masters;

import org.testng.annotations.Test;

public class Employe extends BaseNG {
	
	@Test(priority = 4)
	public void empc() throws Exception {
		
		Lbi.empcrea("khusal", "ankit08", "anit", "hdfc08");
		
		
	}

}
