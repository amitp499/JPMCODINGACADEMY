package com.jp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentDummy")
public class StudentDummy {
	
	@Id
	@Column(name="Student_Id")
	private Long studentId;
	
	@Column(name="Student_Name")
	private String studentName;
	
	@ManyToOne
	@JoinColumn(name="Grade_Id")
	private GradeDummy gradeDummy;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	@Override
	public String toString() {
		return "StudentDummy [studentId=" + studentId + ", studentName=" + studentName + ", gradeid=" + gradeDummy
				+ "]";
	}

	public StudentDummy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public GradeDummy getGradeDummy() {
		return gradeDummy;
	}

	public void setGradeDummy(GradeDummy gradeDummy) {
		this.gradeDummy = gradeDummy;
	}
	
	
	
	

}
