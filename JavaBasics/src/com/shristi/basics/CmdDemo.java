package com.shristi.basics;

public class CmdDemo {

	public static void main(String[] args) {
		String username = args[0];
		System.out.println("Name "+username);
		String userId = args[1];
		int uid = Integer.parseInt(userId);
		System.out.println("UserId "+uid);
		
		String sal = args[2];
		double salary = Double.parseDouble(sal);
		System.out.println("Salary "+salary);
		String city = args[3];
		System.out.println("City "+city);
		
		
	}
	
}





