package com.xworkz.inheritanceapp.java;
import com.xworkz.inheritanceapp.java.JavaFiles.Organ;

public class OrganTester {
	
public static void main(String args[]) {
		
        Organ org = new Organ();
		org.toSense("Tongue");
		System.out.println(" To taste there is sense organ called "  + org.organName);
	}

}
