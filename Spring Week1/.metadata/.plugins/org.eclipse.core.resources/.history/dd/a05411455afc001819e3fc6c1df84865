package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 * When bean alias is not mentioned, the default is class name is camel case
 * 
 * @Component
 * 		@Service : For declaring Service beans
 * 		@Repository	: For declaring DAO beans
 * 		@Controller : For controller in spring MVC
 * 		@RestController : For declaring REST service ayer
 * 
 * 
 */

//@Component("service")
@Service("service")
@Lazy(true)
@Scope("singleton")
public class MyApplServices {

	private MyApplDao dao;
	
	public MyApplServices(){
		
		//This code owns a responsibility of creating and object and holding a reference
		//dao = new MyApplDao();
		System.out.println("Object of class MyApplServices is created");
		
	}
	
	
	//dependency injection using constructor
	//Autowiring/plumbing by type
	@Autowired   //performs same as <constructor-arg ref="dao">		in context.xml
	public MyApplServices(MyApplDao dao){
		
		this.dao=dao;
		
		System.out.println("Object of class MyApplServices(dao) is created");
		
	}
	
}
