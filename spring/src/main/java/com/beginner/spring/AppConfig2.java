package com.beginner.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beginner.beans.Mundo;

@Configuration
public class AppConfig2 {
	
	@Bean
	public Mundo marte() {
		return new Mundo();
	}

}
