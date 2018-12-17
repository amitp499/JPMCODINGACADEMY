package com.jp.client;

import javax.persistence.EntityManager;

import com.jp.entities.Address;
import com.jp.entities.Employee;
import com.jp.util.JPAUtil;

public class ClientOTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = JPAUtil.getEntityManager();
				
				em.getTransaction().begin();
				
				Address homeAddress = new Address();
				
				homeAddress.setAddressId(120L);
				homeAddress.setCity("Mumbai");
				homeAddress.setStreet("Colaba");
				
				homeAddress.setZipCode("400001");
				
				Employee empObj = new Employee();
				
				empObj.setEmpId(101L);
				empObj.setEmpName("Amit");
				empObj.setEmpSal(999.33);				
				empObj.setAddress(homeAddress);
				homeAddress.setEmployee(empObj);
				//em.persist(empObj);
				em.persist(homeAddress);
				
				em.getTransaction().commit();
				em.close();
				

	}

}
