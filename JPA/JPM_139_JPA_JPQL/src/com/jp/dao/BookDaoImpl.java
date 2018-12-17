package com.jp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jp.entity.Book;
import com.jp.util.JPAUtil;

public class BookDaoImpl implements IBookDao{
	
	private Logger logger;
	
	EntityManager em;
	
	
	public BookDaoImpl() {
		
		logger = LoggerFactory.getLogger(BookDaoImpl.class);
		
		 em = JPAUtil.getEntityManager();
	}

	

	@Override
	public Book getBookById(int id) {
	Book book = em.find(Book.class, id);
		//Query qry = em.createNamedQuery("select b.id from Book b where b.id="+id);
	
	logger.info("invoked getBookedId at Booking DaoImpl and book found is :", book);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		//Query qry = em.createNamedQuery("getAllBookTitle");
		String qStr = "Select b1 from Book b1 where b1.title like :ptitle";
		TypedQuery<Book> query = em.createQuery(qStr, Book.class);
		query.setParameter("ptitle", "%"+title+"%");
				
		return query.getResultList();
	}

	@Override
	public Long getBookCount() {
		String qStr = "Select count(b1.id) from Book b1";
		TypedQuery<Long> query = em.createQuery(qStr, Long.class);
		Long count = query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		//String qStr = "Select b1 from Book b1 where b1.author like :pauthor";
		String qStr = "Select b1 from Book b1 where b1.author = :pauthor";
		TypedQuery<Book> query = em.createQuery(qStr, Book.class);
		query.setParameter("pauthor", "%"+author+"%");
		return query.getResultList();
	}

	@Override
	public List<Book> getAllBooks() {
		Query qry = em.createNamedQuery("getAllBooks");
		return qry.getResultList();
	}

	@Override
	public List<Book> getBooksInPriceRange(double low, double high) {
		String qStr = "Select b1 from Book b1 where b1.price between :plow and :phigh";
		TypedQuery<Book> query = em.createQuery(qStr, Book.class);
		query.setParameter("plow", low);
		query.setParameter("phigh", high);
		//query.setParameter("phigh", "%"+author+"%");
		return query.getResultList();
	}
	
	

}
