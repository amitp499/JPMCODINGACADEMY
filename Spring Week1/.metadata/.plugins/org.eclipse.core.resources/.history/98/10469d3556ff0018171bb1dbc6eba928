package com.jp.hr.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="dept")
@Table(name="dept_details")
public class Department implements Serializable{
	
	
	private Integer deptNo;
		
	private String deptName;
	
	private Set<Employee> empList;
	
	
	
	
	@OneToMany(mappedBy="dept", fetch=FetchType.EAGER)    //name of the getter methood department ref in employee class 
	public Set<Employee> getEmpList() {
		return empList;
	}


	public void setEmpList(Set<Employee> empList) {
		this.empList = empList;
	}





	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}




	@Id
	@Column(name="deptno")
	public Integer getDeptNo() {
		return deptNo;
	}





	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}




	@Column(name="deptname")
	public String getDeptName() {
		return deptName;
	}





	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}





	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
