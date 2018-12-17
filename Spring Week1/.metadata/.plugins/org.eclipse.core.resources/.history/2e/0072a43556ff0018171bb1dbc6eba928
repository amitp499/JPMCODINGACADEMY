package com.jp.hr.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Department;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;



@Repository("daoDs")
public class DaoEmployeeImplJPA implements DaoEmployee{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Employee> getEmpList() throws HrException {
		
		String sql = "SELECT e FROM EMP_MTOONE e";
		
		Query qry = entityManager.createQuery(sql);
		
		List<Employee> empList =  qry.getResultList();
		
		//System.out.println(empList);
		
		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		
		//System.out.println(empId);
		//Query qry = entityManager.createNamedQuery("serachById");
		
		//System.out.println(qry.getSingleResult());
		Employee emp = entityManager.find(Employee.class, empId);
		//System.out.println(emp);
		return emp;
		
	}

	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Department> getDeptList() throws HrException {
		
		
		String sql = "SELECT d FROM dept d";
		
		Query qry = entityManager.createQuery(sql);
		
		List<Department> deptList =  qry.getResultList();
		
		//System.out.println(deptList);
		
		return deptList;
	}

	@Override
	public Department getDeptDetails(int deptId) throws HrException {

		Department dept = entityManager.find(Department.class, deptId);
		return dept;
	}

}
