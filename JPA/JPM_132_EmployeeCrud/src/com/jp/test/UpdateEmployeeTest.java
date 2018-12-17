package com.jp.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jp.dao.EmployeeDAO;
import com.jp.dao.IEmployeeDAO;
import com.jp.entities.Employee;
import com.jp.exception.EmployeeException;
import com.jp.service.EmployeeService;
import com.jp.service.IEmployeeService;

public class UpdateEmployeeTest {
	
private static IEmployeeService employeeService;
	
	@BeforeClass
	public static void testDaoObject(){
		
		employeeService = new EmployeeService();
		
		Assert.assertNotNull("employeeservice is null", employeeService);
		
		
	}
	
	
	@Test
	public void testUpdateEmployee() throws EmployeeException{
		
		Employee employee = new Employee("Pandey",2500.00);
		
		Employee emp = employeeService.updateEmployee(employee);
		
		Assert.assertTrue("Employee not updated", emp.getSalary()==5000.00);
		Assert.assertTrue("Employee not updated", emp.getName().equalsIgnoreCase("Amit"));
	}

}
