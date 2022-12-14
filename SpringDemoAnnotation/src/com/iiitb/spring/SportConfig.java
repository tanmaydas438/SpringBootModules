package com.iiitb.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.iiitb.spring")
public class SportConfig {
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}
}
