package com.iiitb.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		TennisCoach coach=context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(coach.dailyWorkout());
		System.out.println(coach.dailyFortune());
		context.close();

	}

}
