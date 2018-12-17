package com.jp.hr.daos;

import javax.persistence.EntityManager;

import com.jp.hr.entities.UserMaster;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.utilities.JPAUtil;

public class DaoUserMasterJpaImpl implements DaoUserMaster {
	
	EntityManager em = JPAUtil.getEntityManager();
	
	
	/*public DaoUserMasterJpaImpl() {
		
		em = JPAUtil.getEntityManager();

	}*/

	@Override
	public UserMaster getUserDetails(String userId) throws HrException {
		
		UserMaster um  = em.find(UserMaster.class,userId );
		return um;
	}
	
	
	
	
	
	
	

}
