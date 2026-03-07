package com.automation;

import java.util.HashSet;

public class Test_15 {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3,4};
		int[] b = {4, 5, 6};
		 
		int[] result = new int[a.length + b.length];
		 
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		
		for(int e:result) {
		System.out.print(e);
		}
		System.out.println();
		//for unique value
		HashSet<Integer> set = new HashSet<>();
		for(int e:result) {
			set.add(e);
			}
			
		for (Integer value : set) {
	        System.out.print(value);
	    }
		
		
		
		
	}

}
