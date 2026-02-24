package com.automation;

import java.util.*;

public class Test_14 {

		  public static void main(String[] args) {

			  String[] logs = { 
						"TC01|LOGIN|PASS|1200", 
						"TC01|CHECKOUT|FAIL|3500",
						"TC02|LOGIN|PASS|900", 
						"TC02|SEARCH|PASS|700", 
						"TC03|LOGIN|FAIL|1500",
						"TC03|LOGIN|FAIL|1400", 
						"TC02|CHECKOUT|PASS|5000" };
			
				        Map<String, Integer> statusCount = new HashMap<>();

				        for(String log : logs) {

				            String[] parts = log.split("\\|");
				            String testCase = parts[0];
				            String acts = parts[1];
				            String status = parts[2];
				            String marks = parts[3];

				            if(status.equals("FAIL")) {
				                System.out.println(testCase + "=" + status);
				            }

							if(statusCount.containsKey(status)) {
								statusCount.put(status, statusCount.get(status)+1);
							}else {
								statusCount.put(status, 1);}
				        }

				        System.out.println("\nStatus Count:");

				        for(Map.Entry<String, Integer> entry : statusCount.entrySet()) {
				            System.out.println(entry.getKey() + " = " + entry.getValue());
				        }
				    
					
		        	
		        	
	}
}
