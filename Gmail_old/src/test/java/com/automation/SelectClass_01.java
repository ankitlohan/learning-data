package com.automation;

public class SelectClass_01 {
	
	static int factorial(int n) {
		int product = 1;
		for (int i = 1; i <=n; i++) {
			product *=i;
		}
		 return product; 
	}
	
	static void pattern1 (int n) {
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println(  );

		}
	}
	
	static void pattern2(int n) {

		for (int i = 1; i <=n; i++) {
			for (int j =n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	static int fab(int n) {
		
		if (n==1 || n==2) {
			 
			return n-1;
			
		}else {

			return fab(n-1) + fab(n-2);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int x=5;
		
		//System.out.println(factorial(x));
		pattern1(5);
		pattern2(5);
		System.out.println(fab(5));
	}

}