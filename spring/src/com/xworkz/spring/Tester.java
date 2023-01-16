package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Tester {
	public static void main(String[] args) {
		
		ApplicationContext bucket=new AnnotationConfigApplicationContext(Confy.class);
		
	Browser b=	(Browser) bucket.getBean(FireBox.class);  // abstraction
	b.browse();
		
		
	}

}
