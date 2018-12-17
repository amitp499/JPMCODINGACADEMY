package com.java;

public class TestDependencyInj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//constructor injection
		/*
		 MyApplDao dao = new MyApplDao();
		MyApplServices services = new MyApplServices(dao);
		 */
		
		ObjectFactory factory = new ObjectFactory();
			
		/*MyApplDao dao = factory.getDao();
		
		MyApplServices services = factory.getService();*/
		
		MyApplDao dao = (MyApplDao)factory.getBean("dao"); //using nick names
		MyApplServices services = (MyApplServices)factory.getBean("service"); //using nick names
		
	}

}
