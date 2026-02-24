package com.collections;

public class SelectionSorting {

	public static void main(String[] args) {
		 int [] arr = {1,4,2,6,3,7,8,5};
		 
			for (int i = 0; i < arr.length-1; i++) {
				int smallest=i;
				for (int j =i+1; j < arr.length; j++) {
					if(arr[smallest]>arr[j]) {
						smallest = j;}}
				int temp = arr[smallest];
				arr[smallest] = arr[i];
				arr[i] = temp;
				}
			
			for (int e : arr) {System.out.print(e);}

	}

}
