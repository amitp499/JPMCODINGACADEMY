package com.jp.fb.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jp.fb.entities.CustomerComplaint;
import com.jp.fb.exceptions.ComplainException;



@Repository("daoDs")
public class DaoCustomerComplainImplJPA implements DaoFundsBank{
	
	@PersistenceContext
	private EntityManager entityManager;

	

	@Override
	public CustomerComplaint getEmpDetails(Integer complaintId) throws ComplainException {

		CustomerComplaint cDetails = entityManager.find(CustomerComplaint.class, complaintId);
		System.out.println(cDetails);
		return cDetails;
	}

	@Override
	public boolean addNewComplaint(CustomerComplaint custComplain) throws ComplainException {
		boolean addComplainFlag = false;
		
		entityManager.persist(custComplain);
		//System.out.println(custComplain.getComplaintId());
		
		
		if (custComplain.getComplaintId()>0){
			addComplainFlag=true;
		}
		return addComplainFlag;
	}

}
