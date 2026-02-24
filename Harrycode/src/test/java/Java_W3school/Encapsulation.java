package Java_W3school;

public class Encapsulation {
	
	private String name;
		
	public String getName() {
		return name;
	}
	
	public void setName(String ankit) { 
	this.name= ankit;
	}

	public static void main(String[] args) {
		Encapsulation nme = new Encapsulation();
		nme.setName("ankit");
		
		System.out.println(nme.getName());
		
	}
	
	
}
