package com.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortunateService fortunateService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortunateService thefortunateService) {
		fortunateService = thefortunateService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortunateService to get a fortune
		return fortunateService.getFortune();
	}

}
