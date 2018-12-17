package com.jp.dao;

import java.util.List;

import com.jp.entities.Employee;
import com.jp.exception.EmployeeException;

public interface IEmployeeDAO {
	
	public Long addEmployee(Employee employee) throws EmployeeException;
	
	public List<Employee> getEmployeeList()throws EmployeeException;//R All Employee -retrieve
	
	public Employee getEmployeeById(Long custId)throws EmployeeException;//S-search

	public Employee updateEmployee(Employee employee)throws EmployeeException;//U-update
	
	public Long deleteEmployeeById(Long empId)throws EmployeeException;//D-delete
	
	public void commitTransaction();
	
	public void beginTransaction();

}
