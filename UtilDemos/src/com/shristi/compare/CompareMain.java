package com.shristi.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("java in Action", "Kathy", 900),
				new Book("Leadership", "Robin", 450),
				new Book("3000 stitches", "Sudha", 380),
				new Book("The 5 am club", "Robin", 650),
				new Book("Seven Habits", "Steve", 1200));
		System.out.println(books);
		
		System.out.println("Sort By Title");
		
		TitleSort titleSort =new TitleSort();
		Collections.sort(books, titleSort);
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("Sort by Author");
		Collections.sort(books, new AuthorSort());
		for (Book book : books) {
			System.out.println(book);
		}
	}
}











