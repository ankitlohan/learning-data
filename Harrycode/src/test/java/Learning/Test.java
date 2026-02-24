package Learning;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Enter a table number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i=1; i<=10; i++) {
			int result = i*n;
			System.out.println(result);

		
		}
		
	}
} 