package com.example.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 监听器，
 * 还需要在config中配置才能生效，参都WebConfig类中registerListener方法
 * @author Liu
 *
 */
public class ListenerDemo implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("destroyed listener");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("initiallized listener");
	}
	
}
