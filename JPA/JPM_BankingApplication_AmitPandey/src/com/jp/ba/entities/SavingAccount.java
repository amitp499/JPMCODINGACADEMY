package com.jp.ba.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value="Saving")
public class SavingAccount extends Account{
	
	private Double overDraftLimit;

	public Double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(Double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	
	

	public SavingAccount(Long accountId, Double acctountBalance, Double overDraftLimit) {
		super(accountId, acctountBalance);
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public String toString() {
		return "SavingAccount [overDraftLimit=" + overDraftLimit + "]";
	}

	
	
	
}
