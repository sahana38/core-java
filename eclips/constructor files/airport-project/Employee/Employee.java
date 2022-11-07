package com.xwokrz.airport;

public class Employee {
	
	
	public String employeeId;
	public String name;
	static public String companyName;
	public String bloodGroup;
	
	//use of construstor is to init the instance variable of a class
	//parameterized constructor
	public  Employee(String empId, String nm, String bGroup) {
		System.out.println("\n Employee object is created");
		employeeId = empId;
		name = nm;
		bloodGroup = bGroup;
	}
	
	   public void toHelpOrgToGrow() {
		    System.out.println("nanu.. nane..");
	   }
}
