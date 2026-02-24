package Learning;

import java.util.Scanner;

public class ScannerClassTask {

	public static void main(String[] args) {
		
		System.out.println("Total 5 subject");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first subject marks");
		float a = sc.nextFloat();
		
		System.out.println("Enter Second subject marks");
		float b = sc.nextFloat();
		
		System.out.println("Enter Third subject marks");
		float c = sc.nextFloat();
		
		System.out.println("Enter Fourth subject marks");
		float d = sc.nextFloat();
		
		System.out.println("Enter Fifth subject marks");
		float e = sc.nextFloat();
		
		float total = ((a+b+c+d+e)/500)*100;		
		System.out.println(total + "%  Percentage");
		

	}

}
