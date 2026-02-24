package com.java;

class emplyoee {
	
	int id;
	int age;
	
	static void getdata() {
		
		System.out.println("name");
		
	}
	
}

public class Classobject {
	
	public static void main(String[] args) {
		
		emplyoee data = new emplyoee();
		
		data.id = 10;
		
		System.out.println(data.id);
		
		data.getdata();
	}

}
