package com.jp.lc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.jp.lc.ServiceBean;


public class LifeCycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		ServiceBean bean =(ServiceBean)ctx.getBean("service");
		System.out.println(bean);
	}

}
