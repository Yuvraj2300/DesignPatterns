package com.dp.DesignPatterns.AOP.ee;

import java.util.logging.Logger;

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
		return	context.proceed();
		
	}
}
