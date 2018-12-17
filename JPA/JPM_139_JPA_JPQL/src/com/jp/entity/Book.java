package com.jp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="books_jpql")
@NamedQueries({
		@NamedQuery(name="getAllBookTitle", query = "Select b1.title from Book b1"),
		@NamedQuery(name="getAllBooks", query = "Select book from Book book")
	})
public class Book implements Serializable{
	
	
	private static final long serialVersionUID = -7184605497587997800L;
	
	@Id
	private Integer id;
	private String title;
	private String author;
	private Double price;
	
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	

}
