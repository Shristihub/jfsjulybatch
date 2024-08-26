package com.ex.basic;

public class MultiCatch {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String val = "popyy"; 
			System.out.println("Value got " + val);
			int num = Integer.parseInt(val);
			System.out.println("num" + num);
			int y = 100 / num;
			System.out.println("Print " + y);
			int arr[] = null;
			System.out.println(arr[3]);
		} catch (ArithmeticException | NumberFormatException 
				| ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter a number greater than zero");
			System.out.println(e.getMessage());
		}catch (RuntimeException e) {
			System.out.println("arr is null");
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("arr is null");
			System.out.println(e.getMessage());
		}System.out.println("continue...");

	}
}
