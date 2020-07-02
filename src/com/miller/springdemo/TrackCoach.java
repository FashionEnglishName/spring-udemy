package com.miller.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run!";
	}

	@Override
	public String getDailyFortune() {
		return "Holiday!";
	}
	
}
