package com.automation;

public class Test_4 {

	public static void main(String[] args) {
		
		String value = "Selenium123";
	    String word = "";
	    String number = "";
	    for(int i=0; i< value.length(); i++){
	    char ch = value.charAt(i);
	    if (Character.isLetter(ch)) {
			word +=ch;
		} else if(Character.isDigit(ch) ) {
			number +=ch;
}	    
}
	    System.out.println(word + " " + word.length());
	    System.out.println(number + " " + number.length());
	    System.out.print("Word spread: ");
	    
	    for (int i = 0; i < word.length(); i++) {
	        System.out.print(word.charAt(i));
	    }
	    System.out.println( );
	    System.out.println("Number: " + number);
	}
}
