package com.shristi.training;

import java.util.List;

import com.shristi.training.exception.BookNotFoundException;

public class BookServiceImpl {

	private IBookDetails bookDetails;

	public void setBookDetails(IBookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	public List<Book> getBooksByAuthor(String author) {
		// book1,book2,book5
		List<Book> booklist = bookDetails.findByAuthor(author);
		if (booklist == null)
			return null;
		if (booklist.isEmpty())
			throw new BookNotFoundException("author not found");
		return booklist.stream().sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle())).toList();

	}

	public String orderBook(int bookId) {
		try {
			Book book = bookDetails.findById(bookId);
			if (book == null || book.getTitle() == null)
				return null;
			else
				return book.getTitle().toUpperCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Book not ordered";

	}

	public String saveBook(Book book) {
		try {
			bookDetails.addBook(book);
			return "Book added";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Book not added";
	}

	// user is Priya return Great day Priya in upper else wrong user name
	public String printMessage(String username) {
		String result = bookDetails.greetUser(username);
		if (result == null)
			return null;
		return result.toUpperCase();
	}
}
