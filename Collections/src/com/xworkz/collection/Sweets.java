package com.xworkz.collection;

import java.util.TreeSet;

public class Sweets {
	
        
		public static void main(String args[]){  
		//Creating and adding elements  
		
		
		String Sweet1 =("Milk cake");
		String Sweet2 =("Honey cake");
		String Sweet3 =("barfi");
		String Sweet4 =("Chocolate cake");
		String Sweet5 =("cake");
		String Sweet6 =("halwa");
		String Sweet7 =("jamun");
		String Sweet8 =("kaju barfi");
		String Sweet9 =("kulfi");
		String Sweet10 =("rasgulla");
		String Sweet11 =("payasam");
		String Sweet12 =("ras malai");
		String Sweet13 =("kheer");
	
		
		TreeSet<String> set=new TreeSet();
		
		set.add(Sweet1); //passing ref  
		set.add(Sweet2);  
		set.add(Sweet3);  
		set.add(Sweet4);
		set.add(Sweet5); 
		set.add(Sweet6);  
		set.add(Sweet7);  
		set.add(Sweet8);
		set.add(Sweet9); 
		set.add(Sweet10);  
		set.add(Sweet11);  
		set.add(Sweet12);
		set.add(Sweet13); 
		System.out.println(set.size());
		
		set.clear();
		System.out.println("After clear..");
		
		System.out.println(set.size());  
		}  
		}  
		 


