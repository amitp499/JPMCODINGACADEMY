package com.jp.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPT_OTM")
public class Department implements Serializable {
	
	private static final long serialVersionUID = -5394805247213803454L;
	
	@Id
	@Column(name="dept_id")
	private Long deptId;
	
	@Column(name="dept_name")
	private String deptName;
	
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
	private Set<Employee> employees;
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName+ "]";
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	

}
