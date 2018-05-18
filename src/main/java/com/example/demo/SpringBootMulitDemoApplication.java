package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportAutoConfiguration 用于引入第三方配置信息
public class SpringBootMulitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMulitDemoApplication.class, args);
	}
}
