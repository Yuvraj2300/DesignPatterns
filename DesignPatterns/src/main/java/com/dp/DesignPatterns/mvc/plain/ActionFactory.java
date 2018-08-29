package com.dp.DesignPatterns.mvc.plain;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
	private	Map<String,Action>	actions	=	new	HashMap<>();
	private	Action	action;
	
	public	ActionFactory() {
		actions.put("GET/users", new	HomeAction());
		actions.put("GET/users/listusers", new	ListUsersAction());
	}
	
	public	synchronized	Action	getAction(HttpServletRequest	req) {
		String	path	=	req.getServletPath()	+	req.getPathInfo();
		String	actionKey	=	req.getMethod()	+	path;
		System.out.println(actionKey);
		action	=	actions.get(actionKey);
		return	action;
	}
	
}
