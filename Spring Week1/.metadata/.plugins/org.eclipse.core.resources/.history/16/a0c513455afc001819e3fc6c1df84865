package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/context.xml");
			
		System.out.println("Context Created");
		MyApplDao dao = (MyApplDao)ctx.getBean("dao");
		System.out.println(dao.hashCode());
		
		MyApplDao dao1 = (MyApplDao)ctx.getBean("dao");
		System.out.println(dao1.hashCode());
		
		MyApplServices service = (MyApplServices)ctx.getBean("service");
		System.out.println(service.hashCode());
		
		MyApplServices service1 = (MyApplServices)ctx.getBean("service");
		System.out.println(service1.hashCode());
		
		CommonAttributes ca = (CommonAttributes)ctx.getBean("commonData");
		System.out.println("common "+ca);
		

	}

}
