package com.automation;

public class Demo {
	public static void main(String[] args) {
		String userName = "Ankit lohan,hs";
		String reverse="";
		String[] parts = userName.split(" ");
		String name = parts[0];
		String last = parts[1];
		System.out.println(name+ " = "+name.length());
		System.out.println(last+ " = "+last.length());
		System.out.println(userName.toLowerCase());
		System.out.println(userName.toUpperCase());
		System.out.println(userName.isEmpty());
		
		for(int i=userName.length()-1; i>=0; i--) {
			reverse += userName.charAt(i);
		}System.out.println(reverse);
		 System.out.println(reverse.length());
			
	}
	
}