package com.shristi.fun;

import java.util.function.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BookFun {

	public static void main(String[] args) {
		MyBook mybook =  new MyBook("Java in Action", "Kathy", 900);
		// implementation
//		Consumer<MyBook> con = bookobj->System.out.println(bookobj);
		Consumer<MyBook> con = bookobj->System.out.println(bookobj.getTitle().toUpperCase());
		con.accept(mybook);
		
		Supplier<MyBook> sup = ()-> new MyBook("Leadership", "Robin", 900);
		System.out.println(sup.get());
		
		Predicate<MyBook> pred = bookobj->bookobj.getTitle().startsWith("Java");
		System.out.println(pred.test(new MyBook("Leadership", "Robin", 900)));
		System.out.println(pred.test(mybook));
 
		Function<MyBook, Double> fun = bookobj->bookobj.getPrice();
		System.out.println(fun.apply(mybook));
		
		
		
		
		
		
	}
}
