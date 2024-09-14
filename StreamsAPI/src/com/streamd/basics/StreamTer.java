package com.streamd.basics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTer {

	public static void main(String[] args) {
		List<String> courses =  Arrays.asList("Java","Junit","css","Html","Angular","Javascript");
		
		//collect, forEach, reduce. findFirst, iterator
		System.out.println("Using foreach");
		 courses.forEach(str->System.out.println(str));
		 System.out.println();
		 
		 System.out.println("Using collect");
		 List<String> ncourses =  courses.stream()
				 .filter(str->str.startsWith("J"))
		         .map(str->str.toUpperCase())
		         .collect(Collectors.toList());
		         System.out.println(ncourses);
	
		         System.out.println();
				 
		 System.out.println("Using iterator");
	     Iterator<String>it =  courses.stream().iterator();
	     while (it.hasNext()) {
			String course = it.next();
			System.out.println(course);
		}
	      
	     courses.stream()
	          .sorted()
	         .forEach(str->System.out.println(str.toUpperCase()));
		 System.out.println();
		 
		 courses.stream()
         .sorted()
        .forEach(System.out::println);
	 System.out.println();
	     
	     
	
	}
}
