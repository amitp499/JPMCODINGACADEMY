package com.jp.test;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import com.jp.util.JPAUtil;



import static org.junit.Assert.assertNotNull;

public class JPAUtilTest {
	
	@Test
	public void testEntityManager(){
		
		EntityManager em = JPAUtil.getEntityManager();
		Assert.assertNotNull("looks fail", em);
	
		
	}
	
	

}
