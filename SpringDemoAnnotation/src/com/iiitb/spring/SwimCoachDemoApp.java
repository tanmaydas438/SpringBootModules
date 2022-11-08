package com.iiitb.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimCoachDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		SwimCoach coach=context.getBean("swimCoach",SwimCoach.class);
		System.out.println(coach.dailyWorkout());
		System.out.println(coach.dailyFortune());
		context.close();

	}

}
