package com.jp.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.entities.GradeDummy;
import com.jp.entities.StudentDummy;
import com.jp.util.JPAUtil;

public class StudentOTM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = JPAUtil.getEntityManager();
		
		GradeDummy gd = new GradeDummy();
		
		gd.setGradeId(1L);
		
		gd.setGradeName("First STD");
		
		StudentDummy sd1 = new StudentDummy();
		StudentDummy sd2 = new StudentDummy();
		StudentDummy sd3 = new StudentDummy();
		
		sd1.setStudentId(101L);
		sd1.setStudentName("Amit");
		sd1.setGradeDummy(gd);
		
		sd2.setStudentId(201L);
		sd2.setStudentName("Sunil");
		sd2.setGradeDummy(gd);
		
		sd3.setStudentId(301L);
		sd3.setStudentName("Rohit");
		sd3.setGradeDummy(gd);
		
		
		
		Set<StudentDummy> studentList = new HashSet<>();
		studentList.add(sd1);
		studentList.add(sd2);
		studentList.add(sd3);
		
		gd.setStudentDummys(studentList);
		
		em.getTransaction().begin();
		
		em.persist(gd);
		
		em.getTransaction().commit();
		
		em.close();

	}

}
