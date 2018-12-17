package com.jp.service;

import java.util.List;

import com.jp.dao.EmployeeDAO;
import com.jp.dao.IEmployeeDAO;
import com.jp.entities.Employee;
import com.jp.exception.EmployeeException;

public class EmployeeService implements IEmployeeService {

		private IEmployeeDAO employeeDao;
		
		
		
		public EmployeeService(){
			
			employeeDao = new EmployeeDAO();
		}
		
		
	@Override
	public Long addEmployee(Employee employee) throws EmployeeException {
		employeeDao.beginTransaction();
		employeeDao.addEmployee(employee);
		employeeDao.commitTransaction();
		return employee.getEmployeeId();
	}


	@Override
	public List<Employee> getEmployeeList() throws EmployeeException {
		// TODO Auto-generated method stub
		
		return employeeDao.getEmployeeList();
	}


	@Override
	public Employee getEmployeeById(Long custId) throws EmployeeException {
				
		return employeeDao.getEmployeeById(custId);
	}


	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		employeeDao.beginTransaction();
		employeeDao.updateEmployee(employee);
		employeeDao.commitTransaction();
		return employee;
	}


	@Override
	public Long deleteEmployeeById(Long empId) throws EmployeeException {
		employeeDao.beginTransaction();
		employeeDao.deleteEmployeeById(empId);
		employeeDao.commitTransaction();
		return empId;
	}

}
