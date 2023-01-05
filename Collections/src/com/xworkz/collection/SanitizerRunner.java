package com.xworkz.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SanitizerRunner {
	
	public static void main(String[] a) {
		
		SanitizerDTO sanitizerDTO1 = new SanitizerDTO(1, "Dettol", 45 , "red");
		SanitizerDTO sanitizerDTO2 = new SanitizerDTO(2, "Try-active", 50 , "white");
		SanitizerDTO sanitizerDTO3 = new SanitizerDTO(3, "sanitllium", 52 , "pink");
		SanitizerDTO sanitizerDTO4 = new SanitizerDTO(4, "Saniola", 40 , "green");
		SanitizerDTO sanitizerDTO5 = new SanitizerDTO(5, "Nano", 30 , "blue");
		SanitizerDTO sanitizerDTO6 = new SanitizerDTO(6, "Sofskin", 200 , "");
		SanitizerDTO sanitizerDTO7 = new SanitizerDTO(7, "Reyo herbs", 5 , "white");
		SanitizerDTO sanitizerDTO8 = new SanitizerDTO(8, "lifebuoy", 120 , "colorless");
		SanitizerDTO sanitizerDTO9 = new SanitizerDTO(9, "pigeon", 130 , "black");
		SanitizerDTO sanitizerDTO10= new SanitizerDTO(10, "Zest", 140 , "red");
		
		LinkedList<SanitizerDTO> collection = new LinkedList<SanitizerDTO>();
		collection.add(sanitizerDTO10);
		collection.add(sanitizerDTO9);
		collection.add(sanitizerDTO8);
		collection.add(sanitizerDTO7);
		collection.add(sanitizerDTO6);
		collection.add(sanitizerDTO5);
		collection.add(sanitizerDTO4);
		collection.add(sanitizerDTO3);
		collection.add(sanitizerDTO2);
		collection.add(sanitizerDTO1);
			
		Iterator<SanitizerDTO> ref = collection.iterator();
		while(ref.hasNext()) {
			SanitizerDTO value = ref.next();
			
			if(value.getPrice() > 5) {
				System.out.println(value);
			}
			
			if(value.getPrice() >= 140) {
				System.out.println("-------Maximum price-------- \n " +value);
			}
			
			if(value.getPrice() <= 10) {
				System.out.println("-------Minimum price-------- \n " +value);
			}
			
			if("red".equals(value.getColor())) {
				System.out.println("removed red color brand \n" + value);
				ref.remove();
			}	
			
			if("".equals(value.getColor())) {
				System.out.println("null value \n" + value);
			}
			
			if("green".equals(value.getColor())){
				System.out.println("removed green color brand \n" + value);
				ref.remove();
			}
			
			if("blue".equals(value.getColor())) {
				System.out.println("removed blue color brand \n" + value);
				ref.remove();
			}
		}
	}
}


