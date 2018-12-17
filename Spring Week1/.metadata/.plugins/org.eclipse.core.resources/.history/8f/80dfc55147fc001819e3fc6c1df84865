package com.java;

public class MyApplServices {

	private MyApplDao dao;
	
	public MyApplServices(){
		
		//This code owns a responsibility of creating and object and holding a reference
		dao = new MyApplDao();
		System.out.println("Object of class MyApplServices is created");
		
	}
	
	
	//dependency injection using constructor
	public MyApplServices(MyApplDao dao){
		
		this.dao=dao;
		
		System.out.println("Object of class MyApplServices(dao) is created");
		
	}
	
}
