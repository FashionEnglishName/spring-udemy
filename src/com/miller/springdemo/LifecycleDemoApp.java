package com.miller.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycleDemo-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
				
	}

}
