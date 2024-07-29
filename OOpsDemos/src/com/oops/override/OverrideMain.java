package com.oops.override;

public class OverrideMain {

	public static void main(String[] args) {
		TeamLead teamLead = new GroupOne("Ganga");
		teamLead.doProject();
		
		teamLead = new GroupTwo("Yamuna");
		teamLead.doProject();
		
		GroupOne one = (GroupOne) teamLead;
		one.doProject();
		one.playGames();
	}
}
