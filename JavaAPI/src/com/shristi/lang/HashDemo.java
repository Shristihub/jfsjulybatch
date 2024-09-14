package com.shristi.lang;

import java.util.Arrays;
import java.util.List;

public class HashDemo {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("A100", "Audi", 2133230);
		Vehicle vehicle2 = new Vehicle("A100", "Audi", 1332300);
		Vehicle vehicle3 = new Vehicle("A100", "Honda", 2133230);
		
//		System.out.println(vehicle1==vehicle2);
//		System.out.println(vehicle2==vehicle3);
//		System.out.println(vehicle3==vehicle1);
//		

		System.out.println(vehicle1.equals(vehicle2));
		System.out.println(vehicle2.equals(vehicle3));
		System.out.println(vehicle3.equals(vehicle1));
		
		System.out.println(vehicle1.hashCode());
		System.out.println(vehicle2.hashCode());
		System.out.println(vehicle3.hashCode());
		
		
	}

}
