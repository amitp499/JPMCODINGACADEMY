package com.jp.product.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jp.product.dao.ProductDao;
import com.jp.product.dao.ProductDaoImpl;
import com.jp.product.entities.Product;
import com.jp.product.exceptions.ProductException;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	//@Autowired  //dependency injection a variable type
	private ProductDao prdser;
	
	@Autowired
	public ProductServiceImpl(@Qualifier("springDao") ProductDao prdser) throws ProductException{
		
		//prdser = new ProductDaoImpl();
		this.prdser = prdser;
		
	}


	public ArrayList<Product> listOfProducts() throws ProductException {
		return prdser.getListOfProducts();
	}


	public Product detailsOfProducts(int pId) throws ProductException {
		
		return prdser.getProductDetails(pId);
		
	}


	public boolean addNewProducts(Product prd) throws ProductException {
		
		return prdser.addProducts(prd);
		
	}


	public boolean deleteProducts(int pId) throws ProductException {
		
		return  prdser.deleteProducts(pId);
	}


	public boolean editProducts(int pId, String pName, String pType) throws ProductException {
		
		return prdser.updateProducts(pId, pName, pType);
	}
	
	
	

}
