package com.jp.fb.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "complaint")
@Table(name = "complaint")
public class CustomerComplaint implements Serializable{

	
	private static final long serialVersionUID = 4797646659395913158L;
	
	
	private Integer complaintId;
	
	//@Pattern(regexp = "[0-9]{10}", message = "ID is invalid , minimum 10 chars needed")
	
	private Integer accountId;   
	
	@NotBlank
	private String branchCode;  
	
	@NotBlank
	private String emailId;  
	
	@NotBlank
	private String category;  
	
	@NotBlank
	private String description; 
	
	
	private String priority;  
	
	
	private String status;

	public CustomerComplaint() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@SequenceGenerator(name="COMPLAINID_GEN", sequenceName="hibernate_sequence", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPLAINID_GEN" )
	@Column(name = "COMPLAINTID")
	public Integer getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Integer complaintId) {
		this.complaintId = complaintId;
	}

	@Column(name = "ACCOUNTID")
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Column(name = "BRANCHCODE")
	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	
	@Column(name = "EMAILID")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "CATEGORY")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "PRIORITY")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Column(name = "STATUS")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CustomerComplaint [complaintId=" + complaintId + ", accountId=" + accountId + ", branchCode="
				+ branchCode + ", emailId=" + emailId + ", category=" + category + ", description=" + description
				+ ", priority=" + priority + ", status=" + status + "]";
	}

	public CustomerComplaint(Integer complaintId, Integer accountId, String branchCode, String emailId, String category,
			String description, String priority, String status) {
		super();
		this.complaintId = complaintId;
		this.accountId = accountId;
		this.branchCode = branchCode;
		this.emailId = emailId;
		this.category = category;
		this.description = description;
		this.priority = priority;
		this.status = status;
	}  
	
	
	
	
}
