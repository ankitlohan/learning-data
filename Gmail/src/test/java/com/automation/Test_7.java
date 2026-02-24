package com.automation;

public class Test_7 {
	public static void main(String[] args) {
		int[] arr = {1,4,7,3,0,8};

		System.out.print("Even numbers: ");
		for(int n : arr){
		    if(n % 2 == 0)
		        System.out.print(n + " ");
		}

		System.out.print("\nOdd numbers: ");
		for(int n : arr){
		    if(n % 2 != 0)
		        System.out.print(n + " ");
		}
		
		int first = arr[0];

		for(int i=0;i<arr.length-1;i++)
		    arr[i] = arr[i+1];

		arr[arr.length-1] = first;
		System.out.println(first);

	}

}
