package com.jp.fb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.fb.daos.DaoFundsBank;
import com.jp.fb.entities.CustomerComplaint;
import com.jp.fb.exceptions.ComplainException;



@Service("service")
@Transactional
public class ServiceComplainImpl implements ServiceComplain {

	private DaoFundsBank daoComplain;
	
	
	//Resolving Dependence
	public ServiceComplainImpl() throws ComplainException{
		
		//daoEmp = new DaoEmployeeImpl();
		
	}
	
	@Autowired
	public ServiceComplainImpl(@Qualifier("daoDs") DaoFundsBank daoComplain) throws ComplainException{
		
		this.daoComplain = daoComplain;
	
		
	}

	@Override
	public CustomerComplaint getEmpDetails(Integer complaintId) throws ComplainException {
		
		return daoComplain.getEmpDetails(complaintId);
	}

	@Override
	public boolean addNewComplaint(CustomerComplaint custComplain) throws ComplainException {
		
		return daoComplain.addNewComplaint(custComplain);
	}
	
	
	

	

	
	
}
