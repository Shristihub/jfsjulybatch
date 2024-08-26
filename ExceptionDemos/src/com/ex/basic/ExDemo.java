package com.ex.basic;

public class ExDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String val = args[0]; // ten - throws exception
			System.out.println("Value got " + val);
			int num = Integer.parseInt(val);
			System.out.println("num" + num);
			int y = 100 / num;
			System.out.println("Print " + y);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error occured");
			System.out.println(e.getMessage());
		}
		System.out.println("continue...");

	}
}
