package com.automation;

public class Test_8 {
	
	public static void main(String[] args) {
	
	String test = "Ankit";
	
	String reverse = "";
	
	for (int i=test.length()-1; i>=0; i--) {
		reverse += test.charAt(i);
	}
	System.out.println(reverse);

	String count = "This is a string with length";
	System.out.println(count.length());
			
}
}
