package com.jp.product.dao;

import java.util.ArrayList;

import com.jp.product.entities.Product;
import com.jp.product.exceptions.ProductException;

public interface ProductDao {
	
	public ArrayList<Product> getListOfProducts() throws ProductException;
	
	public Product getProductDetails(int pId) throws ProductException;
	
	public boolean addProducts(Product prd) throws ProductException;
	
	public boolean deleteProducts(int pId) throws ProductException;
	
	public boolean updateProducts(int pId, String pName, String pType) throws ProductException;
	

}
