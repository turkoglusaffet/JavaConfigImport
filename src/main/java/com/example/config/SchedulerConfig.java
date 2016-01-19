package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.core.SchedulerBo;

@Configuration
public class SchedulerConfig {

	@Bean(name="scheduler")
	public SchedulerBo schedulerBo(){
		return new SchedulerBo();
	}

}
