package com.jp.client;

import javax.persistence.EntityManager;

import com.jp.entity.Employee;
import com.jp.entity.Manager;
import com.jp.entity.Sales;
import com.jp.util.JPAUtil;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			EntityManager em = JPAUtil.getEntityManager();
			
			em.getTransaction().begin();
			
			Employee emp = new Employee("Amit", 199.99);
			
			
			//emp.setEmpName("Amit");
			//emp.setEmpSal(199.99);
			
			Manager mgr = new Manager("Sunil",888.50, 700.50);
			
			Sales sls = new Sales("Nikita",188.50, 1700.50, 2500.00);
			
			em.persist(emp);
			em.persist(mgr);
			em.persist(sls);
			
			em.getTransaction().commit();
			em.close();
	}

}
