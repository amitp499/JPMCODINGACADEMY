package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

//@Repository("daoDs")
public class DaoEmployeeImplsDS_Spring  implements DaoEmployee{

	@Autowired  // by Type dependency injection
	@Qualifier("ds")
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
				
				connect.close();
				
				//factory.closeConnection();
				
			} catch (SQLException e) {
				
				throw new HrException("Issue with closing connetions.", e);
			
			}
		}
		
				
		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		
		Connection connect = null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try {
			
				String qry = "Select empid,firstname, lastname from emp where empid = ?";
			// connect = getConnection();
				connect = dataSource.getConnection();
			 
			 stmt =connect.prepareStatement(qry);
			 stmt.setInt(1, empId);
			 rs = stmt.executeQuery();
			
			if(rs.next()){
				
				
				String firstNm = rs.getString("firstname");
				String lastNm = rs.getString("lastname");
				
				return new Employee(empId, firstNm, lastNm);
			}else{
				//Id is wrong
				
				return null;
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
				
				connect.close();
				
				//factory.closeConnection();
				
			} catch (SQLException e) {
				
				throw new HrException("Issue with closing connetions.", e);
			
			}
		}
	}

	
	
	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
		Connection connect = null;
		PreparedStatement stmt=null;
		
		
		try {
			
				String qry = "Insert into  emp(empid, firstname, lastname) values (?,?,?) ";
			 //connect = getConnection();
				connect = dataSource.getConnection();
			 
			 stmt =connect.prepareStatement(qry);
			 stmt.setInt(1, emp.getEmpId());
			 stmt.setString(2, emp.getFirstName());
			 stmt.setString(3, emp.getLastName());
			 
			 int recInserted = stmt.executeUpdate();
			 return recInserted==1?true:false;
			 				
			
		} catch (SQLException e) {
			
			throw new HrException("Issue with fetching.", e);
		}
			
			
			
		finally{
			
			try {
				
				
				
				if (stmt !=null){
					
					stmt.close();
				}
				
				connect.close();
				
				//factory.closeConnection();
				
			} catch (SQLException e) {
				
				throw new HrException("Issue with closing connetions.", e);
			
			}
		}
		
				
		
		
		
		
	}

	
	

}
