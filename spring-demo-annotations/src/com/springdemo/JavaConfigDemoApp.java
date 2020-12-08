package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
 
	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyWorkout());
		
		//Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
//		System.out.println(theCricketCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
