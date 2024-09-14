package com.streamd.basics;

import java.util.Optional;

public class OptDemo {
	
 public static void main(String[] args) {
//	Optional<String> opt = Optional.ofNullable("Great day");
//	Optional<String> opt = Optional.ofNullable(null);
	
	Optional<String> opt = Optional.of(null);
//	System.out.println(opt.get());
	
	if(opt.isPresent())
		System.out.println(opt.get());
	
	if(opt.isEmpty())
		System.out.println("no value");
	
	opt.ifPresent(System.out::println);
	opt.ifPresentOrElse(str->System.out.println(str),
			              ()->System.out.println("Hello"));
	
	
	
}	



}
