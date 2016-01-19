package com.example.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		PersonBo personBo = (PersonBo) context.getBean("person");
		personBo.sendMessage("person");
		SchedulerBo schedulerBo = (SchedulerBo) context.getBean("scheduler");
		schedulerBo.sendMessage("scheduler");

	}
}
