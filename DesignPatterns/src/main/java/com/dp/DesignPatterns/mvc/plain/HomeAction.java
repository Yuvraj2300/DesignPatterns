package com.dp.DesignPatterns.mvc.plain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeAction implements	Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		String	msg	=	"Hey Hello";
		req.setAttribute("message", msg);
		return "/WEB-INF/pages/home.jsp";
	}

}
