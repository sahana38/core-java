package com.xworkz.goa.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CasinoWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
     implements WebMvcConfigurer{

	public CasinoWebInit() {
		System.out.println("created:" +this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("running getServletConfigClasses ");
		return new Class[] {CasinoConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("running getServletMappings");
		return new String[] {"/"};
	}
		
		@Override
		public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
			System.out.println("running configureDefaultServletHandling");
			configurer.enable();
		}
	}


