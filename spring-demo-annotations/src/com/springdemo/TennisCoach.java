package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define my init method
//	@PostConstruct
//	public void doMyStartupStuff() {
//		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
//	}
	
	// define my destroy method
//	@PreDestroy
//	public void doMyCleanupStuff() {
//		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
//	}
	
	
	//define a setter method
	@Autowired
//	public void doSomeCraztStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCraztStuff() method");
//		fortuneService = theFortuneService;
//	}
	
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
