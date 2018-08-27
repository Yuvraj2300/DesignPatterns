package com.dp.DesignPatterns.async.ee;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(asyncSupported=true,urlPatterns= {"/async"})
public class AsyncServlet extends	HttpServlet	{
	
	protected	void	doGet(HttpServletRequest	req,HttpServletResponse	resp) throws IOException {
		final	AsyncContext	asyncContext	=	req.startAsync();
		final	String	data	=	null;
		
		asyncContext.addListener(new	AsyncListener() {
			
			@Override
			public void onTimeout(AsyncEvent arg0) throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartAsync(AsyncEvent arg0) throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onError(AsyncEvent arg0) throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onComplete(AsyncEvent event) throws IOException {
				AsyncContext	asyncContext	=	event.getAsyncContext();
				asyncContext.getResponse().getWriter().println(data);
			}
		});
		
		new	Thread() {
			public	void	run() {
				asyncContext.complete();
			}
		}.start();
		
		resp.getWriter().write("Results: ");
	}
}
