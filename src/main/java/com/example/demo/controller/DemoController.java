package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hi")
	public String  hi(Model model) {
//		try {
//			res.sendRedirect("defaulltDataTables.html");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		model.addAttribute("hi", "this is my hi");
		return "html/defaultDataTables";
	}
}
