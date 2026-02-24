package Java;

public class ifelse {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 0) {
				
				System.out.println(arr[i]);
				
			}else {
				
				System.out.println(arr[i] + " is not divisible by 2");
			}
			
		
		}

		System.out.println("Break condition");
		
       int[] array = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			
			if (array[i] % 2 == 0) {
				
				System.out.println(array[i]);
				break;
				
			}else {
				
				System.out.println(array[i] + " is not divisible by 2");
			}
	}

	}
	}
