package com.inter.basic;

public class HardBookImpl implements IBookInter {

	@Override
	public void showBooks() {
		System.out.println("Books - Tchnical, Fiction  ");
	}

	@Override
	public String[] showFeaturedAuthors() {
		return new String[] {"Kathy","Robin","Tony"};
	}

	public void checkData() {
		System.out.println("checking...");
	}
}
