package Java;

public class method {

	public static void main(String[] args) {

		method d = new method();
		d.getdata();
		
		String name = d.getdata1();
		System.out.println(name);
		
		//using static 
		getdata2();
		
		//diffent class
		method2 d1 = new method2();
		d1.getdatauser();
		
	}
	
	public void getdata() {
		
		System.out.println("hello world");
	}

	public String getdata1() {
		
		System.out.println("hello world 1");
		return "ankit";
	}
	
	
	public static String getdata2() {
	
	System.out.println("hello world 2");
	return "Lohan";
}

}
