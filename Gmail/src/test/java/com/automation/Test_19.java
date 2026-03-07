package com.automation;

import java.util.Arrays;

public class Test_19 {

	public static void main(String[] args) {
		

		        String str = "a,b$c";
		        char[] arr = str.toCharArray();

		        int left = 0;
		        int right = arr.length - 1;

		        while (left < right) {

		            // If left is not alphabet → move left pointer
		            if (!Character.isLetter(arr[left])) {
		                left++;
		            }
		            // If right is not alphabet → move right pointer
		            else if (!Character.isLetter(arr[right])) {
		                right--;
		            }
		            // If both are alphabets → swap
		            else {
		                char temp = arr[left];
		                arr[left] = arr[right];
		                arr[right] = temp;

		                left++;
		                right--;
		            }
		        }

		        System.out.println(new String(arr));

	}

}