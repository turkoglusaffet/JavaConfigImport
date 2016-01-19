package com.example.config;

import org.springframework.context.annotation.Import;

@Import({PersonConfig.class,SchedulerConfig.class})
public class AppConfig {

}
