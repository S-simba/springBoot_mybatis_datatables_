package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * 
 * @author liusy
 *
 */
@SpringBootApplication
public class SpringBootMulitDemoApplication_packaging extends SpringBootServletInitializer {
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SpringBootMulitDemoApplication_packaging.class);
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(SpringBootMulitDemoApplication_packaging.class, args);
	    }

	
}
