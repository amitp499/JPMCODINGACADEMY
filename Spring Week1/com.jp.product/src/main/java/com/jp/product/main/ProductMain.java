package com.jp.product.main;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jp.product.entities.Product;
import com.jp.product.exceptions.ProductException;
import com.jp.product.service.ProductService;
import com.jp.product.service.ProductServiceImpl;

public class ProductMain {
	
	public static void main(String[] args) throws ProductException{
		
		//ProductService ps = new ProductServiceImpl();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		ProductService ps = (ProductService)ctx.getBean("productService");
		
		ArrayList<Product> prdsList = ps.listOfProducts();
		
		for(Product prd: prdsList){
			
			System.out.println(prd);
		}
		
	}

}
