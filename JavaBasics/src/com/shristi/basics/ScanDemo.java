package com.shristi.basics;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		System.out.println("Enter details");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.println("Name "+username);
		int userId = scanner.nextInt();
		System.out.println("UserId "+userId);
		scanner.nextLine();
		String city = scanner.nextLine();
		System.out.println("City "+city);
		double salary = scanner.nextDouble();
		System.out.println("Salary "+salary);
		
		
		scanner.close();
	}
	
}





