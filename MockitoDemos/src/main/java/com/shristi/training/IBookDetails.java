package com.shristi.training;

import java.util.List;

public interface IBookDetails {
    // a proper list, empty list , null,throw exception
	List<Book> findByAuthor(String author);
	
	//may not return anything or throw exception
	void addBook(Book book);
	
	// one book, null or throw exception, a book object
	Book findById(int bookId);
	
	// return the expected o/p or null or exception 
	String greetUser(String name);
}
