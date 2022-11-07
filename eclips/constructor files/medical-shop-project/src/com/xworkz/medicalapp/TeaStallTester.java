package com.xworkz.medicalapp;

public class TeaStallTester {

	
	public static void main(String[] g) {
		
	    TeaStall ref  = new TeaStall();
		System.out.println(ref.name+ " "+ ref.teaStallId + " "+ ref.ownerName);
		ref.name = "Chaiwala";
		ref.teaStallId = 123;
		ref.ownerName = "Akash";
		
		System.out.println(ref.name+ " "+ ref.teaStallId);
		
		
		TeaStall ref1 = new TeaStall("chaiwala", 123, "Akash");
		
		System.out.println(ref1.name+ " "+ ref1.teaStallId + " "+ ref1.ownerName);
		
		
	}
}
