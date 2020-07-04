package com.miller.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean
		SwimCoach theCoach = context.getBean("mySwimCoach", SwimCoach.class);
		
		// call method from bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// close context
		context.close();
		
	}

}
