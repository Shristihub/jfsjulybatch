package com.oops.abs;

public class PhoneShop {

	public static void main(String[] args) {
		Mobile mobile = new SmartPhone();
		mobile.call();
		mobile.sendMoney();
		mobile.showFeatures();
		mobile.showCameraType();
		System.out.println();
		System.out.println(mobile.accessories);
		
		//own method of smartphone
		SmartPhone smartPhone = (SmartPhone)mobile;
		smartPhone.watchMovies();
		
		mobile = new FeaturePhone();
		mobile.call(); //from BP
		mobile.showCameraType();
		mobile.showFeatures();
		mobile.sendMoney(); // from FP
		
		ButtonPhone buttonPhone = (ButtonPhone)mobile;
		buttonPhone.playMusic();
		
		FeaturePhone featurePhone = (FeaturePhone)mobile;
		featurePhone.showGames();
		featurePhone.playMusic();
		
		
		
		
	}
}
