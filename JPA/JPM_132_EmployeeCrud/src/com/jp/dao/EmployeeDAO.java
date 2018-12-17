package com.jp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jp.entities.Employee;
import com.jp.exception.EmployeeException;
import com.jp.util.JPAUtil;

public class EmployeeDAO implements IEmployeeDAO{
	
	private EntityManager entityManager;
	
	public EmployeeDAO(){
		
		entityManager=JPAUtil.getEntityManager();
	}

	@Override		
		public Long addEmployee(Employee employee) throws EmployeeException{
		
		
			
			
			entityManager.persist(employee);
									
			return employee.getEmployeeId();
			
			
		}

	@Override
	public List<Employee> getEmployeeList() throws EmployeeException {
		Query query = entityManager.createQuery("from Employee");
		return query.getResultList();
	}

	@Override
	public Employee getEmployeeById(Long custId) throws EmployeeException {
		
		
		return entityManager.find(Employee.class,custId );
		
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		
		
		
		//employee.setName("amit");
		
		//employee.setSalary(5000.00);
				
		entityManager.merge(employee);
					
	
		
		return employee;
	}

	@Override
	public Long deleteEmployeeById(Long empId) throws EmployeeException {
		// TODO Auto-generated method stub
		entityManager.remove(getEmployeeById(empId));
		
		return empId;
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		
	}
		
	}


