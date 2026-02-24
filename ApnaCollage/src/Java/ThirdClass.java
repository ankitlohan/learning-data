package Java;

import java.util.Scanner;

public class ThirdClass {

	public static void main(String[] args) {
		int age = 55;
		System.out.println("Enter your age");
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		
		switch (age) {
		case 20:
			System.out.println("Your eligible for free tickets");
			break;
			
		case 30:
			System.out.println("Your eligible for free ride");
			break;
			
		case 40:
			System.out.println("Your eligible for free food");
			break;
		default:
			System.out.println("Your not eligible");
			
		}		
		 
		System.out.println("elseif case");
		if (age>60) {
			System.out.println("you are exp");
		} 
		else if (age>50) {
			System.out.println("you are good exp");
		} 
		else if (age>40) {
			System.out.println("you are less exp");
		} 
		else {

			System.out.println("you are not exp");
	}

	}

}
