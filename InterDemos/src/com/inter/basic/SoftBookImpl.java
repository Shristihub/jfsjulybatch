package com.inter.basic;

public abstract class SoftBookImpl implements IBookInter{

	@Override
	public String[] showFeaturedAuthors() {
		return new String[] {"Kathy","John Clear"};
	}
  
}
