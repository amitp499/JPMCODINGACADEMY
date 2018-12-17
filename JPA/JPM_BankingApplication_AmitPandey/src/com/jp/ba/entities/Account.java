package com.jp.ba.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account_tbl")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Account_Type" , discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue("Account")
public class Account {
	@Id
	@Column(name="accountId")
	private Long accountId;
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", acctountBalance=" + acctountBalance + ", customer=" + customer
				+ "]";
	}


	@Column(name="acctountBalance")
	private Double acctountBalance;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Double getAcctountBalance() {
		return acctountBalance;
	}

	public void setAcctountBalance(Double acctountBalance) {
		this.acctountBalance = acctountBalance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

	public Account(Long accountId, Double acctountBalance) {
		
		super();
		this.accountId = accountId;
		this.acctountBalance = acctountBalance;
		
	}
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
