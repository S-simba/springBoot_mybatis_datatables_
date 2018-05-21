package com.example.demo.lister;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

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
