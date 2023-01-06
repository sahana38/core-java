package com.xworkz.spring;

import org.springframework.stereotype.Component;

@Component
public class Fish extends Object{
	
	public Fish() {
		super();
		System.out.println("created fish by spring");
	}

}
