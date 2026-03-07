package com.automation;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_17 {

	public static void main(String[] args) {
		
		        String str = "Aankit";
		        int[] freq = new int[256];  // ASCII array

		        for(int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            freq[ch]++;
		        }

		        for(int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            if(freq[ch] != 0) {
		                System.out.println(ch + " = " + freq[ch]);
		                freq[ch] = 0; // avoid duplicate printing
		            }
		        }
		    
		        HashMap<Character, Integer> map = new HashMap<>();

		        for(char ch : str.toLowerCase().toCharArray()) {
		            map.put(ch, map.getOrDefault(ch, 0) + 1);
		        }

		        System.out.println(map);
	}
}