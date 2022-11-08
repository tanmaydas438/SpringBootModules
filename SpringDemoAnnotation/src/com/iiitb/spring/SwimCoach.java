package com.iiitb.spring;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String dailyWorkout() {
		// TODO Auto-generated method stub
		return "100 meter swim 10 times";
	}
	public String dailyFortune()
	{
		return fortuneService.getFortune();
	}

}
