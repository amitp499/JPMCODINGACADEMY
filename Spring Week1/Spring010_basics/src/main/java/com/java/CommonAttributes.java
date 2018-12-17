package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("commonData")
@Lazy(true)
public class CommonAttributes {

	
	private String companyName;
	private String address;
	private int niftyRank;
	

	public CommonAttributes(@Value("JPMC") String companyName, String address, int niftyRank) {
		super();
		this.companyName = companyName;
		this.address = address;
		this.niftyRank = niftyRank;
	}
	
	public CommonAttributes(String companyName,  int niftyRank) {
		super();
		this.companyName = companyName;		
		this.niftyRank = niftyRank;
	}


	
	
	public String getCompanyName() {
		return companyName;
	}
	
	@Value("dataSource")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	@Value("Powai")
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public int getNiftyRank() {
		return niftyRank;
	}
	
	@Value("40")
	public void setNiftyRank(int niftyRank) {
		this.niftyRank = niftyRank;
	}
	

	@Override
	public String toString() {
		return "CommonAttributes [companyName=" + companyName + ", address=" + address + ", niftyRank=" + niftyRank
				+ "]";
	}



	public CommonAttributes() {
		super();
	}
	
	
	
	
}
