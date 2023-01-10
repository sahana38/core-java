package com.xworkz.mansoon.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Literals
@Component
public class Rocket {
	
	@Value("India")
	private String country;
	@Value("ISLV")
	private String name;
	@Value("3000000.00")
	private double budget;
	
	public Rocket() {
		System.out.println("Created rocket by spring....");
	}
	
	public double getBudget() {
		return budget;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}

}
