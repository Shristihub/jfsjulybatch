package com.streamd.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		List<String> courses = 
			Arrays.asList("Java","Junit","css","Html","Angular","Javascript");
		
		//findFirst
		Optional<String> opt = courses.stream()
								.filter(str->str.startsWith("S"))
								.findFirst();
		
		if(opt.isPresent())System.out.println(opt.get());
		
		String str = courses.stream()
		.filter(str1->str1.startsWith("S"))
		.findFirst()
		.orElse("Share Point");
		System.out.println(str);
		
		
		str = courses.stream()
				.filter(str1->str1.startsWith("S"))
				.findFirst()
				.orElseGet(()->check());
		System.out.println(str);
		
		
		str = courses.stream()
				.filter(str1->str1.startsWith("S"))
				.findFirst()
//				.orElseThrow(()->new ArithmeticException("no data found"));
				.orElseThrow(ArithmeticException::new);
		System.out.println(str);		
	}
	public static String check() {
		return "welcome".toUpperCase();
	}
	
	
}
