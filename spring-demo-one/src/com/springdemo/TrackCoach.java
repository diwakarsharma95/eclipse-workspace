package com.springdemo;

public class TrackCoach implements Coach {
	
	//define a private field for the dependency
		private FortunateService fortunateService;
		
		public TrackCoach() {}
		
		//define a constructor for dependency injection
		public TrackCoach(FortunateService thefortunateService) {
			fortunateService = thefortunateService;
		}
		

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortunateService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	
	// add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}

}
