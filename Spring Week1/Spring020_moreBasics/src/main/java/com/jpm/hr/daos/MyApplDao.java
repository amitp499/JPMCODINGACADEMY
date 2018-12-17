package com.jpm.hr.daos;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("dao")
@Repository("dao")
@Lazy(true)
public class MyApplDao {

	
public MyApplDao(){
		
		//This code owns a responsibility of creating and object and holding a reference
		//dao = new MyApplDao();
		System.out.println("Object of class MyApplDAO is created");
		
	}



}
