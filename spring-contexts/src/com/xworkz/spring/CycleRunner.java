package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CycleRunner {
	
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(CycleConfiguration.class);
		Cycle ref = spring.getBean(Cycle.class);
		System.out.println(ref);
		
	}

}
