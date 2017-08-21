package com.beginner.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beginner.beans.Mundo;

@Configuration
public class AppConfig {
	
	@Bean
	public Mundo mundo()
	{
		return new Mundo();
	}

}
