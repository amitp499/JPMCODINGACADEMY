package com.jp.hr.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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

	public int getEmpId() {   ///property name: empId
		return empId;
	}

	public void setEmpId(int empId) {    ///property empId
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

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
