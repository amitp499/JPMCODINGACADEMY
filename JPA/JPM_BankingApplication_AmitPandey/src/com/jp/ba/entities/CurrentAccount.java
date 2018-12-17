package com.jp.ba.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value="CURRENT")
public class CurrentAccount extends Account {
	
	private Double rateOfInterest;

	public Double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public CurrentAccount(Long accountId, Double acctountBalance, Double rateOfInterest) {
		super(accountId, acctountBalance);
		this.rateOfInterest = rateOfInterest;
		
	}

	@Override
	public String toString() {
		return "CurrentAccount [rateOfInterest=" + rateOfInterest + "]";
	}	
			

}
