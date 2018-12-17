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

public class DeleteEmployeeTest {
	
private static IEmployeeService employeeService;
	
	@BeforeClass
	public static void testDaoObject(){
		
		employeeService = new EmployeeService();
		
		Assert.assertNotNull("employeeservice is null", employeeService);		
		
	}
	
	
	@Test
	public void testDeleteEmployee() throws EmployeeException{
		
		Employee employee = new Employee("Rohit", 6900.00);
		
		Long employeeAdd = employeeService.addEmployee(employee);
		
		Long empId = employeeService.deleteEmployeeById(employeeAdd);
		
		Assert.assertNotNull("Employee not updated", empId);
		
	}

}
