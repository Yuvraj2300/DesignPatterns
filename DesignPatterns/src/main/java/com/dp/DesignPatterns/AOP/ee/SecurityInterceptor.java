package com.dp.DesignPatterns.AOP.ee;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
public class SecurityInterceptor {

	//A POINT CUT MUST BE ANNONATED WITH @AroundInvoke AND RETURN OBJ TYPE AND TAKE IN A PRAMETER OF INVOCATIONCONTEXT 
	@AroundInvoke
	public	Object	doSecurityCheck(InvocationContext	context) throws Exception {
		//do logic
		Logger.getLogger("SecurityLog").info(context.getMethod().getName()+" is accessed");
		
		//Verifyinng user's existennce
		String	user	=	(String) context.getContextData().get("user");
		
		if(user==null) {
			user	=	(String)context.getParameters()[0];
			context.getContextData().put("user", user);
		}
		
		return	context.proceed();
	}
	
	@PostConstruct
	public	void	onStart() {
		Logger.getLogger("SecurityLog").info("Activitating");
	}
	
	@PreDestroy
	public	void	onStop() {
		Logger.getLogger("SecurityLog").info("Deactivating");
	}
	
}
