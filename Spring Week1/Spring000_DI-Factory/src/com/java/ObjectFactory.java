package com.java;

//factory class
public class ObjectFactory {
	
	private MyApplDao dao;
	private MyApplServices services;
	
	
	public ObjectFactory(){
		
		dao = new MyApplDao();
		services = new MyApplServices(dao);
	}
	
	//factory method
	public MyApplDao getDao(){
		
		return dao;
	}
	
	public MyApplServices getService(){
		
		return services;
	}
	
	public Object getBean(String beanName){
		
		switch(beanName){
		
		case "dao":{
			
			return dao;
		}
		case "service":{
			
			return services;
		}
		
		default:{
			
			return null;
		}
		}
	}

}
