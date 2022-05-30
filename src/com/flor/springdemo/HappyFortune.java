package com.flor.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "Lucky day";
	}

}
