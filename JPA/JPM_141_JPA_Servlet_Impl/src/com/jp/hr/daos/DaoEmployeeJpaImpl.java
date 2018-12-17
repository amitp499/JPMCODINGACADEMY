package com.jp.hr.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.utilities.JPAUtil;

public class DaoEmployeeJpaImpl implements DaoEmployee{
	
	
	EntityManager em;
			

	public DaoEmployeeJpaImpl() {
		
		em = JPAUtil.getEntityManager();
	}

	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		Query qry = em.createQuery("from Employee");
		
		ArrayList<Employee> empArrayList = (ArrayList)qry.getResultList();
		
		return empArrayList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		
		Employee empDetails = em.find(Employee.class, empId);
						
		return empDetails;
	}

	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
	
		boolean dataAdded =false;
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
			
			Employee empDetails = em.find(Employee.class, emp.getEmpId());
			
			if(empDetails!=null){
				dataAdded = true;
			}
			
		
		return dataAdded;
	}
	
	
	
	
	

}
