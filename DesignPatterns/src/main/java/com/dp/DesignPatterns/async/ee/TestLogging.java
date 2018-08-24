package com.dp.DesignPatterns.async.ee;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class TestLogging {

	@EJB
	MyLoggingBean	logBean;

	@PostConstruct
	public	void	TestLoggers() {
		System.out.println("call async");
		logBean.logAsync("Log Async");
		
		System.out.println("call sync");
		logBean.logInfo("Log Sync");
		
		System.out.println("Finished");
	}
	
}
