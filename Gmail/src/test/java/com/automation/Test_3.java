package com.automation;

public class Test_3 {

	public static void main(String[] args) {
		
		String str = "This is a new question for you";
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				
				result += "*";
				
			}else {result += ch;}}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}
}
