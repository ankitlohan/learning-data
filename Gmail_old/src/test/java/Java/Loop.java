package Java;

public class Loop {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		int[] array = {45,52,63,74,85,96,74,84};
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
		
		String[] name = {"ankit", "lohan","ankit"};
		
		for (int i = 0; i < name.length; i++) {
	
			System.out.println(name[i]);
		}
		
		//other to user for loop in array
		
		for (String s : name)
		{
			System.out.println(s);
		}
	}

}
