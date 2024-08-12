package com.oops.abs;

public class SmartPhone extends Mobile{

	String accessories = "charger and screen guard";
	@Override
	void showFeatures() {
		System.out.println("play games - SP");
		System.out.println("download apps - SP");
	}

	@Override
	void call() {
		System.out.println("call using number/whatsapp/apps");
	}

	@Override
	void sendMoney() {
		System.out.println("send money using cards/upis");
	}
	// ownmethod
	void watchMovies() {
		System.out.println("watch movies using apps");
	}
	
}
