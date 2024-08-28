package com.shristi.lang;

public class CloneDemo {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("A100", "Audi", 2133230);
		Vehicle nvehicle = null;
		try {
			nvehicle = vehicle.clone();
			System.out.println(nvehicle);
			//check
			System.out.println(vehicle.getClass()==nvehicle.getClass());
			System.out.println(vehicle == nvehicle);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
