package com.mockito.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.shristi.training.Book;
import com.shristi.training.BookServiceImpl;
import com.shristi.training.IBookDetails;
import com.shristi.training.exception.BookNotFoundException;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

	@Mock
	private IBookDetails bookDetails;
	// create an object of bookService to test the methods
	// inject the bookDetails into bookService
	@InjectMocks
	BookServiceImpl bookService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	Book book1, book2, book3, book4, book5;

	@BeforeEach
	void setUp() throws Exception {

		book1 = new Book(1, "Java", "Kathy", 900);
		book2 = new Book(2, "Css", "Kathy", 200);
		book3 = new Book(3, "Seven Habits", "Steve", 300);
		book4 = new Book(4, "5am club", "Robin", 800);
		book5 = new Book(5, "Spring", "Kathy", 1000);
	}

	@Test
	void getByAuthor() {
		String author = "Kathy";
//		from the method, the control enters here
		// the proxy call returns a proper result
		when(bookDetails.findByAuthor(author)).thenReturn(List.of(book1, book2, book5));
		// this will be called first
		List<Book> actualbooks = bookService.getBooksByAuthor(author);
		List<Book> expectedBooks = List.of(book2, book1, book5);
		assertEquals(expectedBooks, actualbooks);

	}

	@Test
	void getByAuthorEmpty() {
		String author = "Steve";
//		from the method call, the control enters here
		// the proxy call returns an empty result
		when(bookDetails.findByAuthor(author)).thenReturn(new ArrayList<Book>());
		// the testcase should throw an exception
		assertThrows(BookNotFoundException.class, ()->bookService.getBooksByAuthor(author));
	}

	@Test
	void getByAuthorNull() {
		String author = "Steve";
//		from the method, the control enters here
		// the proxy call returns null
		when(bookDetails.findByAuthor(author)).thenReturn(null);
		// the method to be tested also should return null
		assertNull(bookService.getBooksByAuthor(author));
	}
	@Test
	@Disabled
	void getByAuthorNeg() {
		String author = "Steve";
//		from the method, the control enters here
//		the proxy call throws an exception
		when(bookDetails.findByAuthor(author)).thenThrow(BookNotFoundException.class);
		// this will be called first
		// the testcase should throw an exception
	 assertThrows(BookNotFoundException.class, ()->bookService.getBooksByAuthor(author));
	}

	@Test
	void testPrintMessage() {
		String username = "Priya";
		when(bookDetails.greetUser(username)).thenReturn("Great Day " + username);

		String actual = bookService.printMessage(username);
		assertEquals("GREAT DAY " + username.toUpperCase(), actual);
	}

	@Test
	void testPrintMessageAsNull() {
		String username = "Jose";
		// the proxy call returns null
		when(bookDetails.greetUser(username)).thenReturn(null);
		// the method to be tested also should return null
		String actual = bookService.printMessage(username);
		assertNull(actual);
	}

	@Test
	void testPrintWrongMessage() {
		String username = "Jose";
		when(bookDetails.greetUser(username)).thenReturn("wrong username");

		String actual = bookService.printMessage(username).toUpperCase();
		assertEquals("WRONG USERNAME", actual);
	}
	
	@Test
	void testOrderBook() {
		// this will be called when there is a call to orderBook
		doReturn(book2).when(bookDetails).findById(2);
		// the method to be tested
		String actual = bookService.orderBook(2);
		// expected 
		assertEquals(book2.getTitle().toUpperCase(), actual);
	}
	
	@Test
	void testOrderBookEx() {
		// this will be called when there is a call to orderBook
		// the proxy throws exception
		doThrow(BookNotFoundException.class).when(bookDetails).findById(20);
		// the method to be tested
//		the method should handle it and return "book not ordered"
		String actual = bookService.orderBook(20);
		
		assertEquals("Book not ordered", actual);
	}
	@Test
	void testOrderBookNull() {
		// this will be called when there is a call to orderBook
		// the proxy returns null
		doReturn(null).when(bookDetails).findById(20);
		// the method to be tested
//		the method should handle it and return "book not ordered"
		String actual = bookService.orderBook(20);
		assertNull(actual);
	}
	
	@Test
	void testOrderBookEmpty() {
		// this will be called when there is a call to orderBook
		// the proxy returns null
		doReturn(new Book()).when(bookDetails).findById(20);
		// the method to be tested
//		the method should handle it and return "book not ordered"
		String actual = bookService.orderBook(20);
//		assertEquals("Book not ordered", actual);
		assertNull(actual);
	}
	
	@Test
	void testSaveBook() {
		// returns nothing
//		doNothing()
		doThrow(BookNotFoundException.class)
		.when(bookDetails).addBook(book1);
		
		String actual = bookService.saveBook(book1);
		assertEquals("Book not added", actual);
	}
	
}
