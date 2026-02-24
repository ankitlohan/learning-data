package com.oops;

class pen {
    
    String colour;
    
    public void read() {
        System.out.println(colour);
    }
}

class Student {
     String name;
     int age;
     
     public void data() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
     
     Student(Student s2) {
        System.out.println("H i am counstroutr");
        this.name = s2.name;
        this.age = s2.age;
     }

     Student (){
         
     }
}   // ✅ Properly closed Student class

public class Construtor {
	public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "ankit";
        s1.age = 34;
        
        Student s2 = new Student(s1);
        
        s2.data();
    }
}

