package com.flor.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FutbolCoach implements Coach {
	
	//Default constructor
		public FutbolCoach() {
			System.out.println(">> PingPongCoach: inside default constructor");
		}


	@Override
	public String getDailyWorkout() {
		return "Run";
	}


	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
