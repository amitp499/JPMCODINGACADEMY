package com.jp.hr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="EMP_MTOONE")
@Table(name="EMP_JPA")
public class Emp {

	private Integer empNo;
	private String empNm;
	private Integer empSal;
	private Integer deptNo;
	
	@Id
	@Column(name="EMPNO")
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	
	@Id
	@Column(name="EMPNAME")
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	
	@Id
	@Column(name="EMPSAL")
	public Integer getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}
	
	@Id
	@Column(name="EMPDEPTNO")
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empNm=" + empNm + ", empSal=" + empSal + ", deptNo=" + deptNo + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
