package com.miller.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter -- setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setter -- setTeam");
		this.team = team;
	}

	public SwimCoach() {
		System.out.println("inside SwimCoach no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter -- setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
