package com.inter.fun;

public class LamDemo {

	public static void main(String[] args) {
		IPrinter printer = ()->System.out.println("Have a great day");
		printer.printMessage();
		System.out.println();
		IChecker checker = (String username)->{
			System.out.println("Hello "+username);
		};
		checker.checkName("Priya");
		// another logic
		checker = username->{
			if(username.equals("Priya")) {
				System.out.println("Welcome "+username);
			}else
				System.out.println("Wrong username");
		};
		checker.checkName("Priya");
		System.out.println();
		
		ICourse iCourse = ()->{
			return "Java";
		};
		System.out.println(iCourse.showCourse().toUpperCase());
		
		ICourse iCourse1 = ()-> "Olympic Season";
		System.out.println(iCourse1.showCourse());
		
		IProcess process = (double a)->{
			return Math.pow(a, 3);
		};
		System.out.println("Cube of  "+process.power(100));
		
		process = a->Math.pow(a,2);
		System.out.println("Square of "+process.power(5));
	}
}
