package com.shristi.basics;

public class SwitchDemo {

	public static void main(String[] args) {
	   String fruit="Apple";
		switch(fruit.toUpperCase()) {
		case "ORANGE":
			System.out.println("Orange is good in vutamin c");
			System.out.println("eat an orange");
			break;
		case "APPLE":
			System.out.println("An apple a day");
			System.out.println("Eat an apple");
			break;
		case "GREENGRAPES":	
		case "BLACKGRAPES":
			System.out.println("Grapes are good");
			break;
		default:{
			System.out.println("Invalid");
		}
		}
		
	}
}
 