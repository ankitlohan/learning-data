package com.java;

class base {
	base(){
		System.out.println("I am constructor");
	}
	base(int b, int c){
		System.out.println("I am constructor " + b + " " + c);
	}
}
 
class derived extends base {
	derived(){
		System.out.println("I am derived constructor");
	}
	derived(int a){
		super(10,11);
		System.out.println("I am derived constructor " + a);
	}
}

class animal extends derived{
	 animal() {
		 super();
		System.out.println("I am animal constructor");
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		//base bas = new base(3);
		//derived ed = new derived(12);
		
		animal inheri = new animal();
	}

}
