package com.inter.trial;

public class Car extends Vehicle implements IAccessories {
    String type; // suv, sedan or MUV
		
	public Car(String model, double price, String brand, String type) {
		super(model, price, brand);
		this.type = type;
	}

	@Override
	public void coverageDetails() {
		System.out.println("coverage for parts and engine");
	}

	@Override
	public String[] showAccessories() {
		return new String[] {"Car cover","music system","car freshener"};
	}

	@Override
  void getMileage() {
		System.out.println("good mileage ");
	}
	// own method
	void showType() {
		if(type.equalsIgnoreCase("suv")) {
			System.out.println("Comfort car");
		}else if(type.equalsIgnoreCase("sedan")) {
			System.out.println("Luxury car");
		}else {
			System.out.println("Regular car");
		}
	}

}
