package test;

public class Aarry {

	public static void main(String[] args) {
		
		int [] arr = new int[6];
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 13;
		arr[3]= 14;
		arr[4]= 15;
		arr[5]= 16;
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		int[] arr2 = {21,31,41,51,61,67,77,6,655,432};
		System.out.println(arr2.length);
		for (int i=0; i< arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		for(int w:arr2) {
			System.out.println(w);
		}
		
		String[] name = new String [5];
		name[0] = "1";
		name[1] = "ankit2";
		name[2] = "ankit3";
		name[3] = "ankit4";
		name[4] = "ankit5";
		
		for (int i=0; i<name.length; i++) {
			
			System.out.println(name[i]);
			
		}
	
	
	
	
	
	
	}

}
