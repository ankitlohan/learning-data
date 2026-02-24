package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
//		ArrayList<String> List = new ArrayList<>();
//		ArrayList<Boolean> List = new ArrayList<>();
//		ArrayList<Float> List = new ArrayList<>();
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		//Add Element
		List.add(0);
		List.add(2);
		List.add(3);
		List.add(4);
		
		System.out.println("Add = " + List);
		

		//Add Get
		int e = List.get(1);
		System.out.println("Get = " + e);
		System.out.println("Get = " + List.get(2));
		
		//add new element in between
		List.add(1, 1);
		System.out.println("AddIndex = " + List);
		
		//Set new element or replace the element
		List.set(2, 5);
		System.out.println("SetIndexElement = " + List);
		
		//Remove Element
		List.remove(2);
		System.out.println("DeleteElement = " + List);
		
		//Size
		int size = List.size();
		System.out.println("Size = " + size);
		
		//Loop
		for (int i = 0; i<List.size(); i++) {
		System.out.print(List.get(i));}
		System.out.println();
		
		//Sorting
		Collections.sort(List);
		System.out.println("Sorting = " + size);
		
	}

}
