package com.automation;
import java.util.*;
public class Test_18 {

	public static void main(String[] args) {
		String s = "Ankit lohan !@ # $ % ^ & * ( ) __-+={}[]:;<.>,/?1234567890`~ is a Coder";

		HashMap<Character, Integer> map = new HashMap<>();
		 for(char ch :s.toLowerCase().toCharArray()) {
			 if(Character.isLetter(ch)) {
				 map.put(ch, map.getOrDefault(ch, 0)+1);
			 } 
		 }

		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		        
		    
		


	}

}
