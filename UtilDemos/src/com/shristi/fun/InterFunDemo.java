package com.shristi.fun;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterFunDemo {
	public static void main(String[] args) {
		// consumer to print value
		// just implementation
		Consumer<String> con = (str)->{
			System.out.println(str.toUpperCase());
		};
		//call it
		con.accept("great day");
		
		Consumer<Integer> conin = num->System.out.println(Math.pow(num, 2));
		conin.accept(10);
		BiConsumer<String, String> bicon = (str,str1)->	System.out.println(str.concat(str1));
		bicon.accept("Hello ", "Priya");
		BiConsumer<String, Integer> biconin = (str, num)->System.out.println("Bonus for "+str+" "+num);
		biconin.accept("Priya", 10000);
		
		biconin = (str, num)->{
			if(str.length()>num)System.out.println("Welcome "+str);
			else System.out.println("Wrong username");
		};
		biconin.accept("Priya", 4);
	
	 // Supplier returns value
		Supplier<String> sup = ()->"Good night";
	    System.out.println(sup.get());
	    
	 // predicate checks condt
	    Predicate<String> pred = str->{
	    	if(str.length()>5)return true;
			else return false;
	    };
	    System.out.println(pred.test("Sera Bell"));
	    
	    BiPredicate<String,Integer> bipred = (str,num)->{
	    	if(str.length()>num)return true;
			else return false;
	    };
	    System.out.println(bipred.test("Sera Bell",4));
	    
	    // takes an input of one type and retirns an output of same/different type
	    Function<String,String> fun = str-> str.toUpperCase();
	    System.out.println(fun.apply("priya"));
	    
	    Function<String,Integer> fun1 = str-> str.length();
	    System.out.println(fun1.apply("Good day"));
	    
	    BiFunction<Integer, Integer, String> fun2 = (num1,num2)->{
	    	if(num1==num2) return "Equal";
	    	else return "Not equal";
	    };
	    System.out.println(fun2.apply(100, null));
	    
	}

}
