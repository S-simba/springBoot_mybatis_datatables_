package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * 
 * 打包成war
 * 重写configure方法。并在pom文件中修改其打包方式为war
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
