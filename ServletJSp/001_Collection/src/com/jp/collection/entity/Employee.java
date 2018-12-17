package com.jp.collection.entity;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private double empSal;
	private static int numId;
	private static final String CO_NAME;  //blank final
	
	
	//static block which is used to initilize only stati value
	static{
		
		numId = (int)(1000 +Math.random()*123.123);
		CO_NAME="JP MORGAN";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode() == obj.hashCode();
	}


	//generates the hascode for the objects
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getEmpId();
	}


	{
		empId=numId++;
	}


	public Employee( String empName, double empSal) {
		super();
		
		this.empName = empName;
		this.empSal = empSal;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	public static int getNumId() {
		return numId;
	}


	public static void setNumId(int numId) {
		Employee.numId = numId;
	}


	public static String getCoName() {
		return CO_NAME;
	}


	@Override
	public int compareTo(Employee o) {
	
		return this.empId-o.empId;
	}
	

	
	
	
}
