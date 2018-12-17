package com.jp.hr.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jp.hr.daos.DaoEmployee;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

/*
 * One Layer refers to another layer through interface only
 * Implementation of business rule should be done here in absence of busness layer
 * This layer will also ensure only custom exceptions to come out
 * 
 */


@Service("service")
public class ServiceEmployeeImpl implements ServiceEmployee, Role1 {

	private DaoEmployee daoEmp;
	
	
	//Resolving Dependence
	public ServiceEmployeeImpl() throws HrException{
		
		//daoEmp = new DaoEmployeeImpl();
		
	}
	
	@Autowired
	public ServiceEmployeeImpl(@Qualifier("daoDs") DaoEmployee daoEmp) throws HrException{
		
		this.daoEmp = daoEmp;
		//daoEmp = new DaoEmployeeImpl();
		
	}
	
	
	

	@Override
	public List<Employee> getEmpList() throws HrException {
			//System.out.println("dislay data-->"+daoEmp.getEmpList());
		return daoEmp.getEmpList();
	}


	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		
		return daoEmp.getEmpDetails(empId);
		
	}

	@Override
	public boolean addNewEmp(Employee emp) throws HrException {
		
		return daoEmp.insertNewRecord(emp);
	}

	
	
}
