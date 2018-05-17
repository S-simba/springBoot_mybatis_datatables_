package com.example.demo.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataSourcePropertiesTest {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext run = SpringApplication.run(DataSourcePropertiesTest.class, args);
		run.getBean(DataSourceProperties.class).showDSP();
	}


}
