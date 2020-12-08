package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "This is the message from your Cricket Coach.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "This is the fortune from your Cricket class";
	}

}
