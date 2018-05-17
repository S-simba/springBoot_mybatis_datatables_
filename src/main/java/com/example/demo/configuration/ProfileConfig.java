package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
/**
 * 多环境配置。不仅可以使用配置文件，也可以使用@Configuration类来进行配置
 * @author Liu
 *
 */
@Configuration
public class ProfileConfig {
	
	@Bean
	@Profile("dev")
	public Runnable dev() {
		System.out.println("开发环境bean");
		 return () -> {};
	}
	@Bean
	@Profile("test")
	public Runnable test() {
		System.out.println("开发环境bean");
		return () -> {};
	}
	@Bean
	@Profile("prod")
	public Runnable prod() {
		System.out.println("开发环境bean");
		return () -> {};
	}

}
