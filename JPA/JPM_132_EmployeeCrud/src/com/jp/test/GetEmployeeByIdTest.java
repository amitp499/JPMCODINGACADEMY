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

public class GetEmployeeByIdTest {
	
private static IEmployeeService employeeService;
	
	@BeforeClass
	public static void testDaoObject(){
		
		employeeService = new EmployeeService();
		
		Assert.assertNotNull("employeeservice is null", employeeService);
		
		
	}
	
	
	@Test
	public void testGetEmployeeById() throws EmployeeException{
		
		Employee employee = new Employee("Shaunak", 7900.00);
		
		Long employeeAdd = employeeService.addEmployee(employee);
		
		Employee empId = employeeService.getEmployeeById(employeeAdd);
		
		Assert.assertTrue("Employee not updated", empId.getName().equals("Shaunak"));
		Assert.assertTrue("Employee not updated", empId.getSalary()==7900.00);
	}

}
