package Java_W3school;

public class InheritanceSubClass extends Inheritance {

	
	private String module = "Ford";
	
	public static void main(String[] args) {
		
		InheritanceSubClass car = new InheritanceSubClass();
		
		car.honk();
		
		System.out.println(car.brand);
		
		System.out.println(car.module);
		
	}
	
	
	
}
