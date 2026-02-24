package Learning;

public class Methodcalling {
	
	static int sum (int x, int y) {
		int z = x+y;		
		return z;
	}
	
	static void num()
	{
		System.out.println("method overloading");
	}	
	
	static void num(int a)
	{
		System.out.println("method overloading");
	}	
	
	static void num(int a, int b)
	{
		System.out.println("method overloading");
	}	
	static void message() {
		System.out.println("Hello Java");
	}
	
	public static void main(String[] args) {
		int a=10, b=20;
		int c = sum(a, b);
		System.out.println(c);
		
		message();
		Methodcalling data = new Methodcalling();
		data.message();
		
		num();
		num(100);
		num(10, 100);
	}

}
