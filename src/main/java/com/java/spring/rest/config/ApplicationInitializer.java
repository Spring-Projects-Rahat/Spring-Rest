package com.java.spring.rest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]
				{
						ApplicationConfig.class   //Returing Config Class
				}
				;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]
				{
						ApplicationConfig.class   //Returing Config Class
				}
				;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		//Returning Servlet Mapping
		return new String[] {
				   "/rest/*"
				  };
	}
 

}
