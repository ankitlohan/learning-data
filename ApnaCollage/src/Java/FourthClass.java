package Java;

import java.util.Iterator;

public class FourthClass {
	
	public static void name(int a, int b) {
		int name = a+b;
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		name(a,b);
		
		int n = 4;
		int m = 5;
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=m; j++) {
				if(i==1 || j==1 || i==n || j==m) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		

			
			
	}

}
