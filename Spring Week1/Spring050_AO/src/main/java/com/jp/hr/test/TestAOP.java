package com.jp.hr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jp.hr.services.MyServices;

public class TestAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		MyServices services = ctx.getBean(MyServices.class);
		services.abcMethod1();
		services.abcMethod2(10);
		services.abcMethod3(20,30);

	}

}
