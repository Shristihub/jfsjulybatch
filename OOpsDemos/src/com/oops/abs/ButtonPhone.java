package com.oops.abs;

abstract public class ButtonPhone extends Mobile{

	@Override
	void showFeatures() {
		System.out.println("play games");
	}

	@Override
	void call() {
		System.out.println("call using number");
	}

	 //ownmethod
	 void playMusic() {
		 System.out.println("play music from SD card");
	 }
	
}
