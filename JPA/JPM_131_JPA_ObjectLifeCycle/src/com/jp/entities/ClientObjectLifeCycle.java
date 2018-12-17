package com.jp.entities;

import javax.persistence.EntityManager;

import com.jp.util.JPAUtil;

public class ClientObjectLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		Greet greet = new Greet();
		
		greet.setMessage("welcome to JPA Session");
		System.out.println(" before adding greet obj on db with id= "+greet.getMessage());
		em.persist(greet);
		System.out.println("adding greet obj on db with id= "+greet.getMessage());
		greet.setMessage("welcome to JPA Session - update");
		em.merge(greet);
		System.out.println("update greet obj on db with id= "+greet.getMessage());
		greet.setMessage("welcome to JPA Session - delete");
		em.remove(greet);
		em.getTransaction().commit();
		
		
		em.close();
		
		JPAUtil.closeEntityManagerFactory();

	}

}
