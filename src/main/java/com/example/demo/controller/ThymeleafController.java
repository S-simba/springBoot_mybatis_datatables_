package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("tyemeleaf")
public class ThymeleafController {
    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {
        
        map.put("msg", "tyemeleaf is changed ");
        return "hello";
    }
}
