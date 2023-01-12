package com.xworkz.autowiredBean.Boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowiredBean.Bean.Engine;
import com.xworkz.autowiredBean.Configuration.EngineConfiguration;

public class EngineRunner {
	
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(EngineConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Engine refOfEngine = container.getBean(Engine.class);
		System.out.println(refOfEngine);
	}

}
