package Learning;

public class Ch_17_logical {

	public static void main(String[] args) {
		
		boolean a= true;
		boolean b= true;
		boolean c= false;
		
		System.out.println("For logical AND");
		if (a && b) {
			System.out.println("Y");
		} 
		else {
			System.out.println("N");
		}
		System.out.println("For logical OR");
		if (a || c) {
			
			System.out.println("Y");
		} 
		else {
			System.out.println("N");
		}
		System.out.println("For logical NOT");
	    System.out.print("Not(a) is ");
	    System.out.println(!a);
	    System.out.print("Not(c) is ");
	    System.out.println(!c);
		
		
	}

}
