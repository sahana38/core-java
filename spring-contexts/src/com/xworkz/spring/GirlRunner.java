package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GirlRunner {
	
public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(GirlConfiguration.class);
		Girl ref = spring.getBean(Girl.class);
		System.out.println(ref);
				
	}

}
