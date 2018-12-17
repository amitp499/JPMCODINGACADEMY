package com.jp.hr.advises;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;


@Aspect
public class SecurityCheck implements Ordered{
	
	//@Around("execution(* com.jp.hr.services.MyServices.*(*,*))")  //any method with two parametest
	//@Around("execution(* com.jp.hr.services.MyServices.3(..))")   // third method in the mentioned class
	//@Around("execution(* com.jp.hr.services.MyServices.*(..))")	//Any method with any parameter
	//@Around("within(* com.jp.hr.services.MyServices)")  //all the methods of MyServces class
	//@Around("within(* com.jp.hr.services.*MyServices)")  //all the methods of class ending with name MyServices
	@Around("execution(* com.jp.hr.services.MyServices.*(..))")  ///point cut
	public Object checkAuthorization(ProceedingJoinPoint doCall) throws Throwable{
		
		System.out.println("check for authorixzation");
		Object obj = doCall.proceed();   
		System.out.println("logging");
		System.out.println("=================End===========================");
		
		return obj;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
