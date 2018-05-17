package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class WebConfig {
	@Value("${ds.userName}")
	private String userName;
	
	@Autowired
	private Environment environment;
	
	public void show() {
		System.out.println("ds.userName :"+ userName);
		System.out.println("ds.password :"+ this.environment.getProperty("ds.password"));
	}

}
