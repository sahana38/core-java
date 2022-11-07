package com.xworkz.inheritanceapp.java;

import com.xworkz.inheritanceapp.java.JavaFiles.CoffeePowder;

public class CoffeePowderTester {
public static void main(String args[]) {
		
        CoffeePowder coffee = new CoffeePowder();
		coffee.toMakeCoffee("relaxing the mind");
		System.out.println("Coffe is good for " + coffee.name);
	}

}
