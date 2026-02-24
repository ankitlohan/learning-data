package Java;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		
		System.out.println("take input");
		Scanner sc = new Scanner(System.in);
		
		//Int number
		System.out.println("First number");
		int a = sc.nextInt();
		System.out.println("Second number");
		int b = sc.nextInt();
		int sum = a*b;
		System.out.println("the sum of two number is " + sum);
		
		//Float number		
		System.out.println("First number");
		float e = sc.nextFloat();
		System.out.println("Second number");
		float r = sc.nextFloat();
		float total = e+r;
		System.out.println("the total of all float " + total);
		
		//String next
		System.out.println("first word");
		String nam = sc.next();
		System.out.println(nam);
		
		//String Line
		System.out.println("second word");
		String name = sc.nextLine();
		boolean cond = sc.hasNextLine();
		System.out.println(cond);
		System.out.println(name);

	}

}
