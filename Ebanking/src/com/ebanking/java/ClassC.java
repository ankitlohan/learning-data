package com.ebanking.java;

public class ClassC extends ClassB{

	
	public void m3() {
		
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		
		a.m1();
		
		ClassB b = new ClassB();
		
		b.m1();
		
		b.m2();

		ClassC c = new ClassC();
		
		c.m1();
		c.m2();
		c.m3();
		
		
	}
}
