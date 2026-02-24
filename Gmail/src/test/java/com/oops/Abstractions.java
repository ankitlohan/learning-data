package com.oops;

class user{
	 
	private String name;
	private int age;
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public void SetAge(int age) {
		this.age = age;
	}
	
	public String GetName() {
		
		return name;
	}
	public int GetAge() {
		
		return age;
	}
}

public class Abstractions {

	public static void main(String[] args) {
		
		user us = new user();
		us.SetName("ankit");
		us.SetAge(23);
			
		System.out.println(us.GetName());
		System.out.println(us.GetAge());
	}
}
