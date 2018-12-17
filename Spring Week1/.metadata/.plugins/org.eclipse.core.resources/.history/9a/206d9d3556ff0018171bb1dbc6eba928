package com.jp.hr.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="EMP_MTOONE")
@Table(name="EMP_JPA")
//@NamedQuery(query = "Select e from Employee e where e.empno = 10" , name="serachById")
public class Employee implements Serializable{

	private static final long serialVersionUID = -1720982300628296463L;
	private Integer empNo;
	private String empNm;
	private Float empSal;
	//private Integer deptNo;
	
	private Department dept; //association field
	
	@Id
	@Column(name="EMPNO")
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	
	
	
	@OneToOne
	@JoinColumn(name="EMPDEPTNO")     //emp table column name (foreign key)
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	@Column(name="EMPNAME")
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	
	
	@Column(name="EMPSAL")
	public Float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}
	
	
	/*@Column(name="EMPDEPTNO")
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}*/
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empNm=" + empNm + ", empSal=" + empSal +  "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
