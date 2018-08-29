package com.dp.DesignPatterns.mvc.plain;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Action action = AbstractActionFactory.getInstance().getAction(req);
		
		String view = action.execute(req, res);
		
		getServletContext().getRequestDispatcher(view).forward(req, res);
	}

}
