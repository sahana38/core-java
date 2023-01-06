package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BusRunner {
	
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(BusConfiguration.class);
		Bus ref = spring.getBean(Bus.class);
		System.out.println(ref);
	}
	

}
