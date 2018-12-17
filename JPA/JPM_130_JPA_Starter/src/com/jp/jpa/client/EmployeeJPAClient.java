package com.jp.jpa.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jp.jpa.entities.Employee;

public class EmployeeJPAClient {

	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Emp id: ");
		int empId = scanner.nextInt();*/
		
	//Steps to be performed
		
		String persistenceUnitName ="JPA-PU"; //got it from persistance.xml
	//Step1: EnityManagerFactory;
		EntityManagerFactory emFactory  = Persistence.createEntityManagerFactory(persistenceUnitName);
	//Step2: EnityManager;
		EntityManager em = emFactory.createEntityManager();
	//Step3 : beigin transaction;
		em.getTransaction().begin();
	//Step4 : create the entity object and persist entity;
		Employee employee = new Employee("Rohit", 999);
		em.persist(employee);   //persisting employee object into db
	//Step5 : commit transaction;
		em.getTransaction().commit();
		
		Employee e1 = em.find(Employee.class, employee.getEmployeeId());   //find can be used only with coullmn thats primary ket or with @id
		System.out.println("Employee: "+e1);
	//Step6 : Close EnityManager;
		em.close();
	//Step7 : close EntityManagerFactory;*/
		emFactory.close();
		
	

	}

}
