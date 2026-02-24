package com.automation;

public class Test_2 {
	 
	public static void main(String[] args) {
	
		int[] arr = {1,0,2,3,0,4,5,0};
		int count = 0;
		
		for(int n:arr){if(n==0){count++;}}
		
		int[] result = new int[arr.length+count];
		int a=0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				result[a]=0;
				result[a+1]=0;
				a = a+2;
			}else {
				result[a++] = arr[i];}}
		
		for (int i : result) { System.out.print(i);	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}