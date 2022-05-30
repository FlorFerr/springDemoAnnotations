package com.flor.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	// Default constructor
	public TennisCoach() {
		System.out.println("Default constructor");
	}
	
	
	
	

	@Override
	public String getDailyWorkout() {
		return "Practice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
