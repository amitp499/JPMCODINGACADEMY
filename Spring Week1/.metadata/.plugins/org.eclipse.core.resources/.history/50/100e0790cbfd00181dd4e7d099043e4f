package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

@Repository("daoDs")
public class DaoEmployeeImplsDS_Spring  implements DaoEmployee{

	@Autowired  // by Type dependency injection
	private DataSource dataSource;
	
	//@Resource - annotation by java and supported by Spring Fremawork
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		
		ArrayList<Employee> empList = new ArrayList<>();
		Connection connect = null;
		Statement stmt=null;
		ResultSet rs =null;
		
		try {
			
			 //connect = getConnection();
			connect = dataSource.getConnection();
			 stmt =connect.createStatement();
			 rs = stmt.executeQuery("Select empid,firstname, lastname from emp");
			
			while(rs.next()){
				
				int empId = rs.getInt("empid");
				String firstNm = rs.getString("firstname");
				String lastNm = rs.getString("lastname");
				
				empList.add(new Employee(empId, firstNm, lastNm));
			}
			
			
		} catch (SQLException e) {
			
			throw new HrException("Issue with fetching.", e);
		}
			
			
			
		finally{
			
			try {
				
				if (rs !=null){
				
					rs.close();
				}
				
				if (stmt !=null){
					
					stmt.close();
				}
				
				
				
				//factory.closeConnection();
				
			} catch (SQLException e) {
				
				throw new HrException("Issue with closing connetions.", e);
			
			}
		}
		
				
		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
