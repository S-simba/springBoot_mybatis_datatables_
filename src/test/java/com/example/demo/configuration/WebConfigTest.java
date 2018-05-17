package com.example.demo.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebConfigTest {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext run = SpringApplication.run(WebConfigTest.class, args);
		run.getBean(WebConfig.class).show();
	}


}
