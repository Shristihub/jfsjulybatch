package com.streamd.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreate {

	public static void main(String[] args) {
		List<String> courses =  Arrays.asList("Java","Junit","css","Html","Angular","Javascript");
	    // filter, map,sort, skip, limit,concat, flatmap - intermediate
		// forEach,collect, reduce,iterator
		
		//convert a list into a stream 
		List<String> ncourses = courses.stream()
		      .filter(str->str.startsWith("J")) // intermediate operation
		      .collect(Collectors.toList()); // terminal operation
		      System.out.println(ncourses);
		  
		 System.out.println("USing foreach");
		 ncourses.forEach(str->System.out.println(str));
		 System.out.println();
		 // convert an array in to a stream
		 Stream.of("apple","orange","kiwi","grapes","banana","blueberry","guava")
		 .filter(str->str.length()>4)
		 .sorted()
		 .map(str->str.toUpperCase())
		 .limit(2)
		 .forEach(System.out::println);
		 System.out.println();
		 // specialized streams
		 int[] nums = {20,10,24,45,5,6,88,75,63};
		 Arrays.stream(nums)
		 .filter(num-> num%2==0)
		 .forEach(System.out::println);
		 
		 
		 // generate a stream
		 Stream.generate(()->"Sri").limit(4).forEach(System.out::println);
		 System.out.println();
		 
		 Stream.of("apple","orange","kiwi","grapes","banana","blueberry","guava")
		 .filter(str->str.length()>4)
		 .map(str->str.length())
		 .sorted()
		 .forEach(System.out::println);
		
		      
		      
		
	}
}
