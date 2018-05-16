package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/hi")
	public String  hi(HttpServletRequest req,HttpServletResponse res) {
		try {
			res.sendRedirect("defaulltDataTables.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "../resources/templates/html/defaulltDataTables.html";
	}
}
