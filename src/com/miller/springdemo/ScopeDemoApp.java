package com.miller.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scropDemo-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("same object? " + (theCoach == alphaCoach));
		
		context.close();
				
	}

}
