package com.jp.collection.entity;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		
		return arg0.getEmpName().compareTo(arg1.getEmpName());
	}
	
	

}
