package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
 
	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
//		Coach theCoach = context.getBean("tennisCoach", Coach.class);
//		Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
		SwimCoach theSwimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theSwimCoach.getDailyWorkout());
		
		//Call method to get the daily fortune
//		System.out.println(theCoach.getDailyFortune());
//		System.out.println(theCricketCoach.getDailyFortune());
		System.out.println(theSwimCoach.getDailyFortune());
		
		//call our new swim coach methods... has the porps values injected
		System.out.println("email: "+theSwimCoach.getEmail());
		System.out.println("team: "+theSwimCoach.getTeam());
		
		// close the context
		context.close();
	}

}
