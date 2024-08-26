package com.ex.basic;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String val = "pop"; // ten - throws exception
			System.out.println("Value got " + val);
			int num = Integer.parseInt(val);
			System.out.println("num" + num);
			int y = 100 / num;
			System.out.println("Print " + y);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("error occured");
//			System.out.println(e.getMessage());
		}finally {
			System.out.println("clos db");
		}
		System.out.println("continue");

	}
}
