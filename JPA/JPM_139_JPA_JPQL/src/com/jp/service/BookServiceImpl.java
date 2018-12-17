package com.jp.service;

import java.util.List;

import javax.persistence.Query;

import com.jp.dao.BookDaoImpl;
import com.jp.dao.IBookDao;
import com.jp.entity.Book;

public class BookServiceImpl implements IBookService{
	
	private IBookDao dao;
	
	
	

	public BookServiceImpl() {
		dao = new BookDaoImpl();
	}

	@Override
	public Book getBookById(int id) {
		
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
	
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBooksInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getBooksInPriceRange(low, high);
	}

}
