package com.example.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.User;

@Controller
@RequestMapping("fastjson")
public class FastJsonController {
	@RequestMapping("test")
	@ResponseBody
	public User test() {
		User user = new User();

		user.setUserID(0);
		user.setName("jhon");
		user.setBirthday(new Date());
//		int i =1/0;
		return user;
	}
}
