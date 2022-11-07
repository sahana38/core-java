package com.xwokrz.airport;

public class EmployeeTester {
	public static void main(String[] args) {
		
		//static variables are shared among multiple Objects
		Employee.companyName = "Amazon";
	
	
	Employee emp = new Employee("AWS123", "Sahana" ,  "A+");
	//instance variables cannot be shared among multiple Objects
	
	System.out.println("*****Employee details*****");
	System.out.println(" Id: "+ emp.employeeId +"\n Name: "+ emp.name +"\n bGroup: "+ emp.bloodGroup);
	System.out.println(" Company Name: "+Employee.companyName);

	
	
	Employee emp1 = new Employee("AWS124", "Sneha" ,  "B+");
	
	System.out.println("*****Employee details*****");
	System.out.println(" Id: " +emp1.employeeId +"\n Name: "+ emp1.name +" \n bGroup: "+ emp1.bloodGroup);
	System.out.println(" Company Name: "+Employee.companyName);
	
	
	
	Employee emp2 = new Employee("AWS125", "Suman" ,  "AB+");
	
	System.out.println("*****Employee details*****");
	System.out.println(" Id: " +emp2.employeeId +"\n Name: "+ emp2.name +"\n bGroup: "+ emp2.bloodGroup);
	System.out.println(" Company Name: "+Employee.companyName);
	 }
}