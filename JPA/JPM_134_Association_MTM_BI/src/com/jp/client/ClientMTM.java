package com.jp.client;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.entities.Order;
import com.jp.entities.Product;
import com.jp.util.JPAUtil;

public class ClientMTM {

	public static void main(String[] args) {		
		
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		Product elecp1 = new Product();
		elecp1.setProductId(101L);
		elecp1.setProductName("LED TV");
		elecp1.setProductPrice(45000.00);
		
		Product beautycp2 = new Product();
		beautycp2.setProductId(102L);
		beautycp2.setProductName("Face Wash");
		beautycp2.setProductPrice(80.88);
		
		Product babycp3 = new Product();
		babycp3.setProductId(103L);
		babycp3.setProductName("Baby Soap");
		babycp3.setProductPrice(99.99);
		
		Set<Product> products = new HashSet<>();
		products.add(elecp1);
		products.add(beautycp2);
		products.add(babycp3);
		
		Order firstOrder = new Order();
		
		firstOrder.setOrderId(1L);
		firstOrder.setPurchaseDate(new Date());	
		firstOrder.setProducts(products);
		
		Order secondOrder = new Order();
		
		secondOrder.setOrderId(2L);
		secondOrder.setPurchaseDate(new Date());		
		secondOrder.setProducts(products);
		
		Set<Order> orders = new HashSet<>();
		orders.add(firstOrder);
		orders.add(secondOrder);
		
		elecp1.setOrders(orders);
		beautycp2.setOrders(orders);
		babycp3.setOrders(orders);
		
		em.persist(firstOrder);
		em.persist(secondOrder);
		
		em.getTransaction().commit();
		em.close();

	}

}
