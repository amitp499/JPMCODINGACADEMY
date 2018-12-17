package com.jp.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jp.dao.EmployeeDAO;
import com.jp.dao.IEmployeeDAO;
import com.jp.entities.Employee;
import com.jp.exception.EmployeeException;

public class EmployeeDaoTest {
	
	
	private static IEmployeeDAO employeeDao;
	
	@BeforeClass
	public static void testDaoObject(){
		
		employeeDao = new EmployeeDAO();
		
		Assert.assertNotNull("employeeDao is null", employeeDao);
		
		
	}
	
	
	@Test
	public void testAddEmployee() throws EmployeeException{
		
		Employee employee =new Employee("Amit", 999.99);
		
		Long empId = employeeDao.addEmployee(employee);
		Assert.assertTrue("Employee not added", empId>0);;
	}

}
