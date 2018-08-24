package com.dp.DesignPatterns.async.ee;

import java.util.logging.Logger;

import javax.ejb.Asynchronous;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup	
@Singleton
public class MyLoggingBean {
	private	Logger	logger;
	
	public	void	start() {
		logger	=	Logger.getLogger("MyGlobalLogger");
		logger.info("Well I started first!!");
	}
	
	public void logInfo(String msg) {
		logger.info("Entering Sync");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		logger.info(msg);
	}

	@Asynchronous
	public void logAsync(String msg) {
		logger.info("Entering Async");

		try {
			Thread.sleep(13000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		logger.info(msg);
	}
}
