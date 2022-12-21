package com.xworkz.collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;


public class Animals {
	
	public static void main(String[] c) {
		
		
		String animal1 ="dog";
		String animal2 = "cat";
		String animal3 = "camel";
		String animal4 = "Tiger";
		String animal5 = "mankey";
		String animal6 = "Elephant";
		String animal7 = "gorilla";
		String animal8 ="horse";
		String animal9 = "deer";
		String animal10 = "lion";
		
		Collection<String> animal = new ArrayList<String>();
		animal.add(animal10);
		animal.add(animal9);
		animal.add(animal8);
		animal.add(animal7);
		animal.add(animal6);
		animal.add(animal5);
		animal.add(animal4);
		animal.add(animal3);
		animal.add(animal2);
		animal.add(animal1);
		
		System.out.println(animal);
		
		for(String element : animal) {
			System.out.println(element);
		}
		
		System.out.println("------Iterator-----");
		
		Iterator<String> ref = animal.iterator();
		while(ref.hasNext()) {
			
			String element = ref.next();
			System.out.println(element);
		}
	}

}
