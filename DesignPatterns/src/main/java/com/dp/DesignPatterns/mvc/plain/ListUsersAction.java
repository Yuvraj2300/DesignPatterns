package com.dp.DesignPatterns.mvc.plain;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListUsersAction implements	Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		
		List<String>	userList	=	new	ArrayList<>();
		userList.add("John Lennon");
		userList.add("Rick McElroy");
		userList.add("Morty McElroy");
		userList.add("Marshall Mathers");
		req.setAttribute("listusers", userList);
		
		return "/WEB-INF/pages/listusers.jsp";
	}

}
