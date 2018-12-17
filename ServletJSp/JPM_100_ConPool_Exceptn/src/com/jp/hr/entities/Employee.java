package com.jp.hr.entities;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	
	
	public Employee(int empId, String firstName, String lastName) {
	
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public Employee(String firstName, String lastName) {
		

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
