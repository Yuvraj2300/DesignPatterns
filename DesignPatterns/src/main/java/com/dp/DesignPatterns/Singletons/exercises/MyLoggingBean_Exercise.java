package com.dp.DesignPatterns.Singletons.exercises;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class MyLoggingBean_Exercise {
	
	private	Logger	logger;
	
	@PostConstruct
	public	void	start() {
		logger	=	Logger.getLogger("MyGlobalLogger");
		logger.info("I Started first!!!");
	}
	
	public	void	logInfo(String	msg) {
		logger.info(msg); 
	}
}
