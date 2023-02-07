package com.xworkz.sahana;


import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.sahana")
public class SahanaConfig {
	
	public SahanaConfig() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
}
