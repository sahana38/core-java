package com.xworkz.inheritanceapp.java;
import com.xworkz.inheritanceapp.java.JavaFiles.Fruits;
import com.xworkz.inheritanceapp.java.ExtendsFile.Apple;
import com.xworkz.inheritanceapp.java.ExtendsFile.Orange;

public class FruitTester {
	
	/*package com.xworkz.inheritance;

	import com.xworkz.inheritance.apple.Apple;
	import com.xworkz.inheritance.fruit.Fruit;
	import com.xworkz.inheritance.orange.Orange;*/

		public static void main(String args[]) {
			
			Fruits fr = new Fruits();
			fr.toGetHealthier(40);
			System.out.println("Price of the fruit is " + fr.price);
			
			Apple ap = new Apple();
			ap.toGetHealthier(40);
			ap.provideVitamins("Fiber");
			System.out.println("Price of apple is " + ap.price);
			System.out.println("Content in apple is " + ap.content);
			
			Orange orng = new Orange();
			orng.toGetHealthier(36);
			orng.provideVitamins("Vitamin c ");
			System.out.println("Price of orange is " + orng.price);
			System.out.println("Content in orange is " + orng.content);
		}

	}

