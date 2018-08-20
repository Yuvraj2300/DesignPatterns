package com.dp.DesignPatterns.AOP.ee;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

@Interceptors(SecurityInterceptor.class)
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SomeBusinessService {

	
	//@Interceptors(SecurityInterceptor.class) it will only be called on this method if annotation is here
	public	void	startService() {
		//do logic
		Logger.getLogger("AppLog").info("...done");
	}
	
	public	void	startAnotherService() {
		//do shit
		Logger.getLogger("AppLog").info("...done again");
	}
	
}
