package com.xworkz.spring.dto;

import org.springframework.stereotype.Component;

import com.xworkz.spring.Fuel;

@Component
public class Petrol implements Fuel {

	@Override
	public void consume() {
		System.out.println("Creating the Fuel properties");
		
	}

}
