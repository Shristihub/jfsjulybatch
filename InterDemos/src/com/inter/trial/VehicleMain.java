package com.inter.trial;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Car("A100", 200000, "Audi", "Sedan");
		vehicle.coverageDetails();
		vehicle.printDetails();
		vehicle.getMileage();

		Car car = (Car) vehicle;
		String[] accessories = car.showAccessories();
		for (String accessory : accessories) {
			System.out.println(accessory);
		}
		System.out.println();

		vehicle = new Bike("KT", 130000, "Honda", "1000cc");
		vehicle.coverageDetails();
		vehicle.printDetails();
		vehicle.getMileage();
		((Bike) vehicle).showCategory();
	}
}
