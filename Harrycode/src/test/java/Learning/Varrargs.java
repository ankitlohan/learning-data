package Learning;

public class Varrargs {
	
	static int sum (int ...arr){
		int result=0;
		for (int i : arr) {
			
			result += i;
			
		}
		
		return result;
		
		
	}
	public static void main(String[] args) {
		
		System.out.println("one " + sum(1));
		System.out.println("two " + sum(1+2));
		System.out.println("three " + sum(1+2+3));
		System.out.println("foue " + sum(1+2+3+4));
		System.out.println("five " + sum(1+2+3+4+5));
		System.out.println("six " + 6);
	}
	

}
