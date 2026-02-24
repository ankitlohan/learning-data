package com.automation;

public class Test_1 {

	public static void main(String[] args) {
		int[] arr = {1,0,2,3,0,4,5,0};
		
		int[] result = new int[arr.length];
		int value=0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				result[value] = arr[i];
				value++;
			}
		}
		for(int e: result) {
			System.out.print(e);
		}
System.out.println();
		
		int j = 0;

		for(int i = 0; i < arr.length; i++) {
		    if(arr[i] != 0) {
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		        j++;
		    }
		}for(int e : arr) {
		    System.out.print(e + " ");
		}

	}

}
