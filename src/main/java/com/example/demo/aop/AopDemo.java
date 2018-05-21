package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopDemo {
	 @Around("execution(* com.example.demo.controller.FastJsonController..*(..))")
	public Object aopMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("=====Aspect处理=======");
		Object[] args = pjp.getArgs();
		for (Object arg : args) {
			System.out.println("参数为:" + arg);
		}

		long start = System.currentTimeMillis();

		Object object = pjp.proceed();

		System.out.println("Aspect 耗时:" + (System.currentTimeMillis() - start));

		return pjp;
	}
}
