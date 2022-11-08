package com.iiitb.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach coach=context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(coach.dailyWorkout());
		System.out.println(coach.dailyFortune());
		context.close();

	}

}
