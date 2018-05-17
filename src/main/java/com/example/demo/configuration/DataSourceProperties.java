package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="ds")
public class DataSourceProperties {
	
	private String userName;
	private String driverClassName;
	private String url;
	private String password;
	
	public  void showDSP() {
		System.out.println("url:"+ this.url);
		System.out.println("drviceClassName:"+ this.driverClassName);
		System.out.println("userName:"+ this.userName);
		System.out.println("password:"+ this.password);
	} 

}
