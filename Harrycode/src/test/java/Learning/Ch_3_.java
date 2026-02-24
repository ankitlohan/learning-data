package Learning;

import java.util.Scanner;

public class Ch_3_ {
	
	public static void main(String[] args) {
		
		float a = 7/4.0f * 9/2.0f;
		System.out.println(a);
		
		char grade = 'D';
		grade =  (char) (grade+8);
		
		System.out.println(grade);
		grade =  (char) (grade-8);
		System.out.println(grade);
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i>8);
	
		
	}

}
