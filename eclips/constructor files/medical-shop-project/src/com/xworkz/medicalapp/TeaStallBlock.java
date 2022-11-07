package com.xworkz.medicalapp;

import java.util.Scanner;
import java.lang.String;  /*It is optional because it is default*/

import com.xworkz.medicalapp.TeaStall;
//import package+className = FQCN(fully qualified class name. or qualified name)

public class TeaStallBlock {
	
	public int id;
	public String name;
	
	public TeaStallBlock(int id, String name) {
		System.out.println("TeaStallBlock Tester Object is called");
		
		this.id =id;
		this.name = name;
		
	}
	
	static {
		System.out.println("static blocks are executing");
	}
	
	{
		System.out.println("Init block are created");
	}
	
	public static void main(String args[]) {
		
		System.out.println("Main method is started");
		
		Scanner sc = new Scanner(System.in);
		
		
		TeaStallBlock test = new TeaStallBlock(1, "somename");
		System.out.println(test.name + " "+ test.id);
		System.out.println("Main method ended");
	}

}
