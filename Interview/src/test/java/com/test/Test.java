package com.test;

import java.util.HashMap;
import java.util.Map;

public class Test {   	
	
	 public static void main(String[] args) {
		  
		 String[] apiLogs = {
				  "GET /users -> 200",
				  "POST /login -> 401",
				  "GET /users -> 200",
				  "GET /orders -> 500",
				  "POST /login -> 200",
				  "GET /orders -> 200",
				  "GET /orders -> 500"
				};
				 
		 Map<String, Integer> count = new HashMap<String, Integer>();
		 
		 for(String e : apiLogs) {
			 String[] api = e.split(" ");
			 
			String full = api[1];
			String code= api[3];
			
			if(!code.equals("200")) {
				System.out.println(full + " = " + code);
			}
			 
		   if(count.containsKey(code)) {
			   count.put(code, count.get(code)+1);
		   }else {
			   count.put(code, 1);
		   }   
	}   	
		 
		 
		 for(Map.Entry<String, Integer> entry : count.entrySet()) {
			   System.out.println(entry.getKey()+ " "+ entry.getValue());
		   }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}}