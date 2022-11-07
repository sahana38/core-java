package com.xworkz.inheritanceapp.java;

import com.xworkz.inheritanceapp.java.JavaFiles.RunMachine;

public class RunMachineTester {
	
public static void main(String args[]) {
		
        RunMachine run = new RunMachine();
		run.toPlay("Cricket");
		System.out.println(" Virat is good at playing "  + run.name);
	}


}
