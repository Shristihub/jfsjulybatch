package com.inter.fun;

public class LambDemo {

	public static void main(String[] args) {
		// implementating using lambda expression
		IGreeter ref = (String name)->{
			System.out.println("Hello "+name);
		};
		// calling 
		ref.greetMessage("Sri");
		
		ref = name -> System.out.println("Great day "+name);
		ref.greetMessage("Priya"); 
	}
}
