package com.automation;

import java.util.HashSet;
import java.util.Iterator;

public class Test_13 {

    public static void main(String[] args) {

        int[] arr = {1,4,2,6,6,6,5,3,7,8,5,8,6,8};
        
//        for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-i-1; j++) {
//				if(arr[j]>arr[j+1]) {
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;}}
//				
//			}for (int r : arr) {
//				System.out.print(r + " ");}
//			System.out.println();
//			for (int i = 0; i < arr.length; i++) {
//				
//				if(i==0 || arr[i] != arr[i-1]) {
//					System.out.print(arr[i] + " ");
//				}
//				
//			}
//			System.out.println();
			HashSet<Integer> set = new HashSet<>();
			
			for(int e : arr) {
				set.add(e);
			}
			System.out.print(set);
    }
}
