package com.jp.lc;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/*
 * The implementation of initilization interface
 * 		- The name of the imlementing method can not be customizible
 * 		- The exception being thrown can not be changed
 * 		- The initializing code can not be grouped as per catogery in differenrt methods
 * 		- the interface tightly bound  the code to the spring framework
 * 
 * 
 * The ApplicationContextAware is an interface to inject SpringContext reference within bean
 * 		such a reference can be used to achieve dependency relationship
 * 
 * LifeCycle
 * 		1 - Object created and constructor invoked (this is done by JVM)
 * 		2 - All setter methods(value and reference initialization) are called
 * 		3 - All aware methods
 * 		4 - The Init methods (@PostConstruct, afterPropertiesSet())
 */

@Component("service")
public class ServiceBean implements InitializingBean, ApplicationContextAware {
	
	private int x;
	private ApplicationContext ctx;
	
	@Autowired
	public ServiceBean(@Value("20")int x){
		
		this.x=x;
		System.out.println("in constructor with param");
		
	}
	
	@Override   //creates access to another bean
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx =arg0;
		
		System.out.println("setting appln context");
	}
	
	@Value("40")
	public void setValueX( int x){
		
		this.x=x;
		System.out.println("in setter");
	}
	
	@PostConstruct
	public void validateConfig(){
		System.out.println("in validate config");
		if(x>100){
			System.out.println("wrong input");
		}
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in after properties");
	}

	@Override
	public String toString() {
		return "ServiceBean [x=" + x + "]";
	}

	public ServiceBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("in constructor with no param");
	}

	
	
	

}
