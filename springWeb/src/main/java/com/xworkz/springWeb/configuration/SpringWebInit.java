package com.xworkz.springWeb.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit 
extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer {
	
	public SpringWebInit() {
		System.out.println("created :" +this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses(){
		System.out.println("running getRootConfigClasses :");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		Class[] configClass= {SpringBeanConfiguration.class};
		System.out.println("configClass :"+Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		String[] ref= {"/"};
		System.out.println("getServletMappings :"+Arrays.toString(ref));
		return ref;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling");
		configurer.enable();
	}

}


