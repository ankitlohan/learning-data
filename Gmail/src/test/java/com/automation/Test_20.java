package com.automation;

public class Test_20 {
	public static void main(String[] args) {
		
		String name = "ankit lohan";
		
		 for(Character user : name.toLowerCase().toCharArray()) {
		 if(user != 'a' && user != ' ') {
			 System.out.print(user);
		 }
			 
		 }
	}

}
