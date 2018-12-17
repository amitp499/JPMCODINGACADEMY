package com.jp.ba.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_tbl")
public class Customer {
	
	@Id
	@Column(name="customerId")
	private String customerId;
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="customerAddress")
	private String customerAddress;
	
	@Column(name="customerEmail")
	private String customerEmail;
	
	@OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
	private Set<Account> account;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Customer(String customerId, String customerName, String phoneNumber, String customerAddress,
			String customerEmail, Set<Account> account) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.account = account;
	}

	

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", customerAddress=" + customerAddress + ", customerEmail=" + customerEmail + ", account=" + account
				+ "]";
	}



	public String getCustomerId() {
		return customerId;
	}



	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



	public String getCustomerEmail() {
		return customerEmail;
	}



	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}



	public Set<Account> getAccount() {
		return account;
	}



	public void setAccount(Set<Account> account) {
		this.account = account;
	}
	
	
	
	
	
	
	
	
	

}
