package com.example.demo.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 用到三个注解，@ControllerAdvice @ExceptionHandler @RequestBody
 * @author liusy
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> defaultExceptionHandler(Exception e) {
		Map<String,Object> exceptionMap = new HashMap<String, Object>();
		exceptionMap.put("code", 500);
		exceptionMap.put("msg", e.getMessage());
		return exceptionMap;
	}
}
