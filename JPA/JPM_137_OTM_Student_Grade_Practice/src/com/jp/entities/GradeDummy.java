package com.jp.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GradeDummy")
public class GradeDummy {
	
	@Id
	@Column(name="Grade_Id")
	private Long gradeId;
	
	
	@Column(name="Grade_Name")
	private String gradeName;
	
	@OneToMany(mappedBy="gradeDummy", cascade=CascadeType.ALL)
	Set<StudentDummy> studentDummys;

	@Override
	public String toString() {
		return "GradeDummy [gradeId=" + gradeId + ", gradeName=" + gradeName + ", studentDummys=" + studentDummys + "]";
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public Set<StudentDummy> getStudentDummys() {
		return studentDummys;
	}

	public void setStudentDummys(Set<StudentDummy> studentDummys) {
		this.studentDummys = studentDummys;
	}

	public GradeDummy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
