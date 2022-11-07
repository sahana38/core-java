package com.xworkz.inheritanceapp.java;
import com.xworkz.inheritanceapp.java.JavaFiles.Comedian;

public class ComedianTester {
	
public static void main(String args[]) {
		
        Comedian cmdy = new Comedian();
		cmdy.toLough("Jocker");
		System.out.println(" Comedian is also called "  + cmdy.anotherName);
	}

}
