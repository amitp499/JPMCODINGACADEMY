package com.jp.client;

import com.jp.service.BookServiceImpl;
import com.jp.service.IBookService;

public class BookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IBookService service = new BookServiceImpl();
		
		System.out.println(service.getBookById(101));
		
		//System.out.println(service.getBookByTitle("Java Closures and Lambda"));
		
		//System.out.println(service.getAllBooks());
		
		//System.out.println(service.getAuthorBooks("Brett Spell"));
		
		//System.out.println(service.getBookCount());
		//System.out.println(service.getBooksInPriceRange(100.00, 5000.00));
	}

}
