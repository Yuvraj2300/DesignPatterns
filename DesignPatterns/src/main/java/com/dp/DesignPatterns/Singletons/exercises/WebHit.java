package com.dp.DesignPatterns.Singletons.exercises;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
@DependsOn("MyLoggingBean_Exercise")
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class WebHit {
	
	private	Map<String,Integer>	hitMap;
	private	Integer	count;
	
	@EJB
	private	MyLoggingBean_Exercise	loggingBean;
	
	@PostConstruct
	public	void	start() {
		loggingBean.logInfo("Started Web Hit prog...!");
		hitMap	=	new	HashMap<String, Integer>();
		count	=	0;
	}
	
	
	@Lock(LockType.WRITE)
	public	Integer	incrementCount() {
		count	=	++count;
		return	count;
	}
	
	@Lock(LockType.READ)
	public	Map<String,Integer>	getHits(String	ip,Integer	hitCount) {
		hitMap.put(ip, hitCount);
		return	hitMap;
	}
}
