package com.dp.DesignPatterns.Singletons;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@DependsOn("MyLoggingBean")
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Singleton
@AccessTimeout(value=120000)	//default milliseconds
public class CacheSingletonBean {
	
	private	Map<Integer,String>	myCache	;
	
	@EJB
	private	MyLoggingBean	loggingBean;

		public static void main(String[] args) {
		CacheSingletonBean	cb	=	new	CacheSingletonBean();
		cb.start();
	}
	
	@PostConstruct
	public	void	start() {
		System.out.println("In the PC");
		
		loggingBean.logInfo("Started!!!");
		myCache	=	new	HashMap<Integer, String>();
		
		System.out.println("after PC");
	}
	
	@Lock(LockType.WRITE)
	@AccessTimeout(value=30, unit=TimeUnit.SECONDS)
	public	void	addUser(Integer	id,String	name) {
		myCache.put(id, name);
	}
	
	@Lock(LockType.READ)
	public	void	getUser(Integer	id) {
		myCache.get(id);
	}
}
