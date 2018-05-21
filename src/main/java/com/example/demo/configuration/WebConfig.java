package com.example.demo.configuration;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.config.RegistrationListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.example.demo.controller.servlet.ServletTest;
import com.example.demo.filter.TimeFilter;
import com.example.demo.interceptor.InterceptorDemo;
import com.example.demo.listener.ListenerDemo;

@Configuration
public class WebConfig  extends  WebMvcConfigurerAdapter{
	
	@Value("${ds.userName}")
	private String userName;

	@Autowired
	private Environment environment;
	
	@Autowired
	private InterceptorDemo interceptor;
	
	/**
	 * 添加拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor);
	}

	/**
	 * 用来测试value标签取值，和配置文件取值
	 */
	public void show() {
		System.out.println("ds.userName :" + userName);
		System.out.println("ds.password :" + this.environment.getProperty("ds.password"));
	}

	/**
	 * json配置管理类
	 * 
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);

		HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;

		return new HttpMessageConverters(converter);
	}

	/**
	 * 自建servlet类
	 * 
	 * @return
	 */
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		return new ServletRegistrationBean(new ServletTest(), "/servletTest");
	}

	/**
	 * 自定义拦截器
	 * 
	 * @return
	 */
	@Bean
	public FilterRegistrationBean<TimeFilter> registerFilter() {
		FilterRegistrationBean<TimeFilter> registrationBean = new FilterRegistrationBean<TimeFilter>();

		TimeFilter timeFilter = new TimeFilter();
		registrationBean.setFilter(timeFilter);

		List<String> urls = new ArrayList<>();
		urls.add("/*");
		registrationBean.setUrlPatterns(urls);

		return registrationBean;

	}
	
	@Bean
	public ServletListenerRegistrationBean<ListenerDemo> registerListener(){
		ServletListenerRegistrationBean<ListenerDemo> servletListenerRegistrationBean = new ServletListenerRegistrationBean<ListenerDemo>();
		servletListenerRegistrationBean.setListener(new ListenerDemo());
		return servletListenerRegistrationBean;
	}
}
