package com.jp.hr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name="empRec")
@Table(name="EMP")
public class Employee {

	
	private int empId;
	
	@Size(min = 3, max = 20, message="First Name not meeting size constraints.")
	@Pattern(regexp = "[a-z-A-Z]*", message = "Name has invalid characters")
	private String firstName;
	
	@Size(min = 3, max = 20, message="Last Name not meeting size constraints.")
	@Pattern(regexp = "[a-z-A-Z]*", message = "Name has invalid characters")
	private String lastName;
	
	
	public Employee(int empId, String firstName, String lastName) {
	
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee(){
		
		
	}

	@Id
	@Column(name="EMPID")
	public int getEmpId() {   ///property name: empId
		return empId;
	}

	public void setEmpId(int empId) {    ///property empId
		this.empId = empId;
	}

	@Column(name="FIRSTNAME")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name="LASTNAME")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}
