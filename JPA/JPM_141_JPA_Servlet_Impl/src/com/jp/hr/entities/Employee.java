package com.jp.hr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name="EMP")
public class Employee {
	
	@Id
	//@Column(name="EMPID")	
	@SequenceGenerator(name="EMP_ID_GEN", sequenceName="emp1_id_master_seq", initialValue=1000 , allocationSize=5 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_ID_GEN")	
	private Integer empId;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	
	public Employee(Integer empId, String firstName, String lastName) {
	
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

	public void setEmpId(Integer empId) {    ///property empId
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
