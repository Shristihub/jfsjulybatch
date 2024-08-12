package com.oops.abs;

public abstract class Mobile {

	 String accessories = "charger";
	 abstract void showFeatures();
	 abstract void call();
	 abstract void sendMoney();
	 final void showCameraType() {
		 System.out.println("Has both cameras");
	 }
}
