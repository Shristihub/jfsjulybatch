package com.streamd.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIn {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("Java in Action", "Kathy", 900), 
				new Book("Leadership", "Robin", 450),
				new Book("3000 stitches", "Sudha", 380), 
				new Book("The 5 am club", "Robin", 650),
				new Book("Seven Habits", "Steve", 100),
				new Book("Seven Habits", "Steve", 1200),
				new Book("Seven Habits", "Steve", 400),
				new Book("Seven Habits", "Steve", 600),
				new Book("Seven Habits", "Steve", 800));
	
	books.stream()
	 .filter(book->book.getPrice()>500)
//	 .forEach(book->System.out.println(book.getTitle()));
	.forEach(System.out::println);
	
	System.out.println();
	System.out.println("sorting");
	    books.stream()
	     .sorted((b1,b2)->b2.getTitle().compareTo(b1.getTitle()))
	     .limit(3)
//		 .collect(Collectors.toList());
		.forEach(System.out::println);
	    
	    System.out.println();
	    System.out.println("filter by author");
	    long total = books.stream()
	    .filter(book->book.getAuthor().equals("Steve"))
	    .count();
	    System.out.println(total);
	    
	    System.out.println();
	    System.out.println("Print only the titles ");
	    books.stream()
	    .map(book->book.getTitle())
	    .forEach(System.out::println);
	    
	    System.out.println("Print only the price ");
	    books.stream()
//	    .map(book->book.getPrice())
	    .map(Book::getPrice)
       .forEach(System.out::println);
	    
	    System.out.println("Print  the sum of all the prices ");
	   double summ =  books.stream()
		.filter(book->book.getAuthor().equals("s"))
	    .mapToDouble(Book::getPrice)
	    .sum();
	   System.out.println(summ);
	   
//	   System.out.println();
//	   System.out.println("Print  the second highest  ");
//	   double high = books.stream()
//          .sorted((b1,b2)->((Double)b2.getPrice()).compareTo(b1.getPrice()))
//	      .mapToDouble(book->book.getPrice())
//	      .skip(1)
// 	      .findFirst()
// 	      .getAsDouble();
//	   System.out.println(high);
//	
	
	}
}
