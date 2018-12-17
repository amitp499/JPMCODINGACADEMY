package com.jp.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.entities.Address;
import com.jp.entities.Employee;
import com.jp.util.JPAUtil;

public class ClientOTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = JPAUtil.getEntityManager();
				
				em.getTransaction().begin();
				
				Employee empObj = new Employee();
				
				Address address = new Address();
				
				address.setAddressId(120L);
				address.setCity("Mumbai");
				address.setStreet("Colaba");				
				address.setZipCode("400001");
				
				
				
				
				empObj.setEmpId(101L);
				empObj.setEmpName("Amit");
				empObj.setEmpSal(999.33);								
				empObj.setAddress(address);				
				
				address.setEmployee(empObj);
				
				
				
				em.persist(empObj);
				
				em.getTransaction().commit();
				em.close();
				

	}

}
