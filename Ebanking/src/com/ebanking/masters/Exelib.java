package com.ebanking.masters;

public class Exelib {

	public static void main(String[] args)throws Exception {
		
		//instance class
		
		Library Lb=new Library();
		
		Lb.opnapp("http://122.175.8.158/ranford2");
		
		Lb.Adminlogin("Admin","M1ndq");
		
		Lb.Branchcre("hdfc08","indore gate","12345","INDIA","GOA","GOA");
		
		Lb.Rolecre("anit","E");
		
		Lb.Usercre("icustomer","hdfc08","rachita","pancholi","ankit123","ankit0809");
		
		Lb.empcre("khusal","ankit08","anit","hdfc08");
		
		Lb.logout();
		
		Lb.close();
		
	}
}
