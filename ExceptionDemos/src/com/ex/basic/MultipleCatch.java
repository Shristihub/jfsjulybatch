package com.ex.basic;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String val = args[0]; // ten - throws exception
			System.out.println("Value got " + val);
			int num = Integer.parseInt(val);
			System.out.println("num" + num);
			int y = 100 / num;
			System.out.println("Print " + y);
			int arr[] = null;
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("please enter number greater than zero");
			System.out.println(e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println("please enter a number");
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter a value");
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("arr is null");
			System.out.println(e.getMessage());
		}
		System.out.println("continue...");

	}
}
