 package com.automation;

import java.util.HashMap;
import java.util.Map;

public class Test_9 {
	
public static void main(String[] args) {

    String[] logs = {
        "Alice,Home",
        "Bob,Products",
        "Alice,Products",
        "Alice,Cart",
        "Bob,Home",
        "Charlie,Home",
        "Bob,Cart"
    };
    
    Map<String, Integer> mapes = new HashMap<>();
    
    for (String e : logs) {
        String key = e.split(",")[0];
        
        if (mapes.containsKey(key)) {
            mapes.put(key, mapes.get(key) + 1);
        } else {
            mapes.put(key, 1);
        }
    }
    	
    for (Map.Entry<String, Integer> entry : mapes.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
	  }
