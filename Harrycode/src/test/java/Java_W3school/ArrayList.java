package Java_W3school;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		
		java.util.ArrayList<String> car = new java.util.ArrayList<String>();
		
		car.add("BMW");
		car.add("Audi");
		car.add("Verna");
		
		System.out.println(car.get(1));
		
		Iterator<String> it = car.iterator();
		System.out.println(it.hasNext());
	}

}
