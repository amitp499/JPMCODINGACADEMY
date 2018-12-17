package com.jp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity  //tells JPA that this class object needs to be persistent
@Table(name="emp_master")  // tells hibernate that this class object need to be mapped to the table
public class Employee implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4272455486153858712L;
	@Id //primary key
	//@GeneratedValue(strategy=GenerationType.AUTO)  //creates a sequence and assigns the value to employeeid
	//@GeneratedValue(strategy=GenerationType.TABLE)  //creates a sequence and assigns the value to employeeid
	@SequenceGenerator(name="EMP_GEN", sequenceName="emp_master_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_GEN" )
	private Long employeeId;
	private String name;
	private Double salary;
	
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee(Long employeeId, String name, Double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	

}
