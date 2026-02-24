package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmaps {
	
	   public static void main(String[] args[]) {

   	        // 1️⃣ Creating a HashMap
   	        Map<String, Integer> map = new HashMap<>();
   	        // HashMap stores key-value pairs
   	        // Keys must be unique
   	        // Values can be duplicate
   	        // It does NOT maintain insertion order

   	        // 2️⃣ put() → Insert key-value pairs
   	        map.put("apple", 1);
   	        map.put("banana", 2);
   	        map.put("pineapple", 3);
   	        map.put("lichi", 4);
   	        map.put("mango", 5);
   	        map.put("abc", 6);
   	        map.put("defl", 7);

   	        // 3️⃣ size() → Returns number of entries
   	        System.out.println("Size: " + map.size());

   	        // 4️⃣ get() → Returns value of a key
   	        System.out.println("Value of apple: " + map.get("apple"));

   	        // 5️⃣ getOrDefault() → Returns default value if key not present
   	        System.out.println("Orange value: " + map.getOrDefault("orange", 0));

   	        // 6️⃣ containsKey() → Check if key exists
   	        System.out.println("Contains key 'banana'? " + map.containsKey("banana"));

   	        // 7️⃣ containsValue() → Check if value exists
   	        System.out.println("Contains value 5? " + map.containsValue(5));

   	        // 8️⃣ keySet() → Returns all keys
   	        System.out.println("All Keys: " + map.keySet());

   	        // 9️⃣ values() → Returns all values
   	        System.out.println("All Values: " + map.values());

   	        // 🔟 entrySet() → Returns key-value pair set
   	        System.out.println("All Entries: " + map.entrySet());

   	        // 1️⃣1️⃣ Iterating using entrySet()
   	        for (Entry<String, Integer> entry : map.entrySet()) {
   	            System.out.println(entry.getKey() + " -> " + entry.getValue());
   	        }

   	        // 1️⃣2️⃣ replace() → Replace value of existing key
   	        map.replace("apple", 10);
   	        System.out.println("After replace apple: " + map.get("apple"));

   	        // 1️⃣3️⃣ putIfAbsent() → Adds only if key not present
   	        map.putIfAbsent("apple", 100);   // Won't change because apple exists
   	        map.putIfAbsent("orange", 8);    // Will add because not present
   	        System.out.println("After putIfAbsent: " + map);

   	        // 1️⃣4️⃣ remove() → Remove key
   	        map.remove("abc");
   	        System.out.println("After remove abc: " + map);

   	        // 1️⃣5️⃣ remove(key, value) → Remove only if both match
   	        map.remove("banana", 2);
   	        System.out.println("After conditional remove: " + map);

   	        // 1️⃣6️⃣ isEmpty() → Check if map is empty
   	        System.out.println("Is map empty? " + map.isEmpty());

   	        // 1️⃣7️⃣ clear() → Remove all entries
   	        map.clear();
   	        System.out.println("After clear: " + map);
   	    }
   	}