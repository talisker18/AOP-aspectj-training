package com.henz.AOPspringtraining.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AopApplicationConfiguration {
	
	@Bean
	public TracibleService tracibleServe() {
		return new TracibleService();
	}

}
