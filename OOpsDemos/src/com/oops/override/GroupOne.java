package com.oops.override;

public class GroupOne extends TeamLead{

	public GroupOne(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void doProject() {
		super.doProject();
		System.out.println("In Java");
	}

	void playGames() {
		System.out.println("Play TT in cafeteria");
	}
}
