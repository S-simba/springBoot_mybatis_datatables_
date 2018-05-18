package com.example.demo.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TimeFilter implements Filter  {

	@Override
	public void destroy() {
		System.out.println("销毁 TimeFilter");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println(" entry doFilter");
		Enumeration<String> parameterNames = arg0.getParameterNames();
		if(parameterNames.hasMoreElements()) {
			System.out.println(parameterNames.nextElement());
		}
		System.out.println(".getContextPath():"+arg0.getServletContext().getContextPath());
//		System.out.println(arg0.getServletContext().getRealPath("d:\\"));
//		System.out.println(arg0.getServletContext().getResourcePaths("d:\\"));
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化 TimeFilter");
		System.out.println(".getFilterName():"+ filterConfig.getFilterName());
//		System.out.println( filterConfig.getInitParameter("host"));
//		System.out.println( filterConfig.getInitParameterNames());
//		System.out.println( filterConfig.getServletContext());
	}

}
