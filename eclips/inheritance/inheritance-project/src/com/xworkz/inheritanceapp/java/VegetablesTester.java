package com.xworkz.inheritanceapp.java;
import com.xworkz.inheritanceapp.java.JavaFiles.Vegetables;
import com.xworkz.inheritanceapp.java.ExtendsFile.Potato;
import com.xworkz.inheritanceapp.java.ExtendsFile.Cauliflower;

public class VegetablesTester {
		
		public static void main(String args[]) {
			
			Vegetables veg = new Vegetables();
			veg.toMakeRecipees("Phalav");
			System.out.println("Vegetables are used to make" + veg.recipee);
			
			Potato veg1 = new Potato();
			veg1.toMakeRecipees("French fries");
			System.out.println("Potato is used to make" + veg1.recipee);
			
			Cauliflower veg2 = new Cauliflower();
			veg2.toMakeRecipees("Gobi Manchuri");
			System.out.println("Cauliflower is used to make" +veg2.recipee);
			
			
			
		}

	}



