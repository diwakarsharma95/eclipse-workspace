package com.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortunateService {
	
	private String data[] = {
			"Fortune 1 !",
			"Fortune 2 !",
			"Fortune 4 !",
			"Fortune 5 !"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
