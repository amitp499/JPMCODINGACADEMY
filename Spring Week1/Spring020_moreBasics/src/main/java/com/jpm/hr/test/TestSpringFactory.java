package com.jpm.hr.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpm.hr.daos.MyApplDao;
import com.jpm.hr.services.MyApplServices;

public class TestSpringFactory {
	
	/*
	 * 1 - Creation of an application context
	 * 2 - The classpathXMLApplication Context refers to config file which is relative path on classpath
	 * 3 - Beans are being created eagerly by default, to create objects lazily use attribute "lazy-init" attribute in config
	 * 4 - Beans are getting created as singleton by default
	 * 		To create stateful objects use scope as 'prototype' 
	 * 5 - Prototype are always on demand, nothing like eager creation 
	 * 6 - by default it calls default constructor, if not exist then throws unchecked exception
	 * 7 - Order of bean in context.xml is meaningless
	 * 8 - the <constructor-arg> decides the constructor to be invoked
	 * 9 - the <value> is for defining the initial value while <ref> is for injection
	 *  
	 */

	public static void main(String[] args) {
		
		//Create a spring context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
			
		System.out.println("Context Created");
		MyApplDao dao = (MyApplDao)ctx.getBean("dao");
		System.out.println(dao.hashCode());
		
	
		
		MyApplServices service = (MyApplServices)ctx.getBean("service");
		System.out.println(service.hashCode());
		
	
		

	}

}
