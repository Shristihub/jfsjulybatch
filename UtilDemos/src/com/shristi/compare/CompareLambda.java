package com.shristi.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareLambda {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("java in Action", "Kathy", 900),
				new Book("Leadership", "Robin", 450),
				new Book("3000 stitches", "Sudha", 380),
				new Book("The 5 am club", "Robin", 650),
				new Book("Seven Habits", "Steve", 1200));
		System.out.println(books);
		System.out.println();
		System.out.println("By Title");
		
//		Comparator<Book> titlsort = (o1,o2)->{
//			return o1.getTitle().compareTo(o2.getTitle());
//		};
		Comparator<Book> titlsort = (o1,o2)-> o1.getTitle().compareTo(o2.getTitle());
		Collections.sort(books,titlsort);
		for (Book book : books) {
			System.out.println(book);
		}
		
		System.out.println();
		System.out.println("By Author");
		Collections.sort(books,(o1,o2)->o1.getAuthor().compareTo(o2.getAuthor()));
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println("By Price");
		Collections.sort(books, (o1, o2) -> ((Double)o1.getPrice()).compareTo(o2.getPrice()));
		for (Book book : books) {
			System.out.println(book);
		}
		
	}
}






