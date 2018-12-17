package com.jp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMP_OTM")
public class Employee implements Serializable, Comparable<Employee>{

	
	private static final long serialVersionUID = 7052158927302718379L;
	
	@Id
	@Column(name="EMP_ID")
	private Long empId;
	
	
	@Column(name="EMP_NAME")
	private String empName;

	@Column(name="EMP_SAL")
	private Double empsal;
	
	@Override
	public boolean equals(Object obj) {
		
		return obj.hashCode()==this.hashCode();
	}

	@Override
	public int hashCode() {
				
		return empId.intValue();
	}

	@ManyToOne
	@JoinColumn(name="DEPT_ID") //name of the column which will be created in employee table
	private Department department;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empsal=" + empsal + ", department id=" + department.getDeptId()
				+ "]";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(Double empsal) {
		this.empsal = empsal;
	}

	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return (int) (this.empId-arg0.empId);
	}
	
	

}
