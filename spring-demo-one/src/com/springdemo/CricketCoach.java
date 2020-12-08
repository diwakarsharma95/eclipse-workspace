package com.springdemo;

public class CricketCoach implements Coach {

	private FortunateService fortunateServie;
	
	private String emailAddress;
	private String team;
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach inside setter method - setTeam");
		this.team = team;
	}

	
	
	public CricketCoach() {
		System.out.println("CricketCoach inside no-arg constructor");
	}
	
	
	
	public FortunateService getFortunateServie() {
		return fortunateServie;
	}



	public void setFortunateServie(FortunateService fortunateServie) {
		System.out.println("CricketCoach inside setter method - stFortuneService");
		this.fortunateServie = fortunateServie;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortunateServie.getFortune();
	}

}
