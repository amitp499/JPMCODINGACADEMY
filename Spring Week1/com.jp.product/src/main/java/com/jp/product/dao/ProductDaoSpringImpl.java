package com.jp.product.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jp.product.entities.Product;
import com.jp.product.exceptions.ProductException;

@Repository("springDao")
public class ProductDaoSpringImpl implements ProductDao{
	
	@Autowired
	private DataSource dataSource;
	
	public ArrayList<Product> getListOfProducts() throws ProductException {
		
		ArrayList<Product> prd = new ArrayList<Product>(); 
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			stmt = con.createStatement();
			rs= stmt.executeQuery("Select pid, pname, ptype from product");
			
			while(rs.next()){
				
				int apid =  rs.getInt("pid");
				String apname =  rs.getString("pname");
				String aptype =  rs.getString("ptype");				
				prd.add(new Product(apid, apname, aptype));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ProductException("Issue in fetching record",e);
		}finally{
			
			
				try {
					
					if(rs !=null){
					rs.close();
					}
					
					if(stmt !=null){
						stmt.close();
					}
					
					if(con !=null){
						
						con.close();
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					throw new ProductException("Issue in closing connection",e);
				}				
			}
		
		
		
		return prd;
	}

	public Product getProductDetails(int pId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addProducts(Product prd) throws ProductException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteProducts(int pId) throws ProductException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProducts(int pId, String pName, String pType) throws ProductException {
		// TODO Auto-generated method stub
		return false;
	}

}
