package com.iiitb.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	//private FortuneService fortuneService;
	
	//Dependency Injection using Constructor
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	//Dependency Injection using Setter Method
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	//Field Dependency Injection using JAVA Reflection
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String dailyWorkout() {
		// TODO Auto-generated method stub
		return "pratice doubles";
	}
	@PostConstruct
	public void startMethod()
	{
		System.out.println("Start method");
	}
	
	

	

	public String dailyFortune()
	{
		return fortuneService.getFortune();
	}

}
