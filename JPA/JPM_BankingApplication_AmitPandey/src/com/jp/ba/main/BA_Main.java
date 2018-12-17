package com.jp.ba.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.ba.entities.Account;
import com.jp.ba.entities.CurrentAccount;
import com.jp.ba.entities.Customer;
import com.jp.ba.entities.SavingAccount;
import com.jp.ba.utilities.JPAUtil;

public class BA_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Customer cust = new Customer();
		cust.setCustomerAddress("Aumbai");
		cust.setCustomerEmail("abcd@gmail.com");
		cust.setCustomerId("B2444554");
		cust.setCustomerName("Amit");
		cust.setPhoneNumber("9967586567");
		
		CurrentAccount ca = new CurrentAccount(1598743L, 692000.00 , 10.30);
		
		//SavingAccount sa  = new SavingAccount(1598767543L, 792000.00 , 12.30);
		
		Account act = new Account();
		
		ca.setCustomer(cust);
		
		//act.setAccountId(3434356787686L);		
		//act.setAcctountBalance(5000.00);
		
		
		
		Set<Account> actList = new HashSet<>();
		actList.add(ca);
		
		cust.setAccount(actList);
		
		em.getTransaction().begin();
		em.persist(cust);
		//em.persist(act);
		em.getTransaction().commit();
		em.close();
		
				
		
	}

}
