package com.oops;

class Animal {
	
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
	
	void sound() {
		super.sound();
        //System.out.println("Dog barks");
        
    }	
}
class Cat extends Dog {
	
	void sound() {
		super.sound();
        //System.out.println("Cat Sound");
    }
}
public class Polymorphism {
	
	public static void main(String[] args) {
    	
    	Animal ad = new Cat();
    	ad.sound();
    }
}
