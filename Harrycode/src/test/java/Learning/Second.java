package Learning;

public class Second {

	int x=5, y=10;
	  final int z=11;
	  String fname = "Ankit";
	  
	  int w=1, e=2;
	  
	  int b;
	  
	  public void mySpeed(int maxspeed) {
		  
		  System.out.println("My speed is " + maxspeed);
	  }
	  
	  static void myAge(int age, String name) {
		  
		  System.out.println("my age is " + age);
		  System.out.println("my name is " + name);
	  }
 public Second() {
		  
		  b = 78;
	  }
	  
	  public static void main(String[] args) {
		    Second myObj  = new Second();
		    Second myObj2 = new Second();
		    myObj2.y= 15;
		    Second myObj3 = new Second();
		    Second myNam = new Second();
		    System.out.println(myObj.x);
		    System.out.println(myObj2.y);
		    System.out.println(myObj3.z);
		    System.out.println(myNam.fname);
		    myNam.fname = "Lohan";
		    
		    System.out.println(myNam.fname);
		    
		    
		    Second myOne = new Second();
		    System.out.println(myOne.w);
		    System.out.println(myOne.e);
		    
		    
		 
		 }
		
}
