package com.xworkz.spring.dto;

import org.springframework.stereotype.Component;

import com.xworkz.spring.Fuel;

@Component("avinash")
public class Diesel implements Fuel {

	
	
	@Override
	public void consume() {
		
		
	System.out.println("Creating again fuel properties");
		
	}

}
