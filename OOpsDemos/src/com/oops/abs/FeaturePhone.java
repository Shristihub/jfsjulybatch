package com.oops.abs;

public class FeaturePhone extends ButtonPhone {

	@Override
	void sendMoney() {
		System.out.println("send money using UPIS with featurephone");
	}

	void showGames() {
		System.out.println("play brick games");
	}

	// override
	@Override
	void showFeatures() {
		System.out.println("Has many apps");
	}

	
}
