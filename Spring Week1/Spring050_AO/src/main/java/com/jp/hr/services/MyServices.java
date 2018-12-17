package com.jp.hr.services;

public class MyServices {
	
	
	//join points (target methods)
	public void abcMethod1(){
		
		System.out.println("\t int abc1 - no param");
	}
	
	public void abcMethod2(int x){
		
		System.out.println("\t int abc2 - one param");
	}
	
	public void abcMethod3(int x, int y){
		
		System.out.println("\t int abc3 - two param");
	}

}
