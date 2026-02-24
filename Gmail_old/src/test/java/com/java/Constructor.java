package com.java;

class emplo {
	
	private String name;
	
	public emplo (String name1){
		
		name = name1;
	}
		
	public emplo (){
		
		name = "Lohan";
	}
	public void name() {
		
		System.out.println(name);
		
	}
}


public class Constructor {
	
	public static void main(String[] args) {
		emplo newname = new emplo("ankit");
		emplo newname1 = new emplo();
		newname.name();
		newname1.name();
		
		
		
	}
}
