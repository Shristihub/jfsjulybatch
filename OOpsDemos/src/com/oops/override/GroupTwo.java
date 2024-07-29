package com.oops.override;

public class GroupTwo extends TeamLead{

	public GroupTwo(String name) {
		super(name);
	}

	@Override
	void doProject() {
		System.out.println("In Dotnet");
		super.doProject();
	}
	
	void enjoyBreaks(){
		System.out.println("Having tea in pantry");
	}
	
	

}
