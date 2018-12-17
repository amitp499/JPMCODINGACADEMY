package com.jp.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.entities.Bus;
import com.jp.entities.Passenger;
import com.jp.util.JPAUtil;

public class BusPassenger_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Bus bus = new Bus();
		
		bus.setBusId(340L);
		bus.setBusRoute("Andheri-Ghatkopar");
		
		Passenger p1 = new Passenger();
		
		p1.setPassangerId(101L);
		p1.setPassangerName("Amit");
		p1.setBus(bus);
		
		Passenger p2 = new Passenger();
		
		p2.setPassangerId(102L);
		p2.setPassangerName("Sunil");
		p2.setBus(bus);
		
		Passenger p3 = new Passenger();
		
		p3.setPassangerId(103L);
		p3.setPassangerName("Rohit");
		p3.setBus(bus);
		
		Set<Passenger> passList = new HashSet<>();
		
		passList.add(p1);
		passList.add(p2);
		passList.add(p3);
		
		bus.setPassengers(passList);
		
		em.getTransaction().begin();
		em.persist(bus);
		em.getTransaction().commit();
		em.close();
		
		

	}

}
