package com.dp.DesignPatterns.factory.di;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {
	
	//@Inject
	private	MessageA	messageA;
	
	//@Inject
	private	MessageB	messageB;
	
	public	void	startService() {
		messageA.setMessage("message A");
		messageB.setMessage("message B");

		System.out.println("ServiceCall: "+messageA.getMessage());
		System.out.println("ServiceCall: "+messageB.getMessage());
	}
	
	public static void main(String[] args) {
		EventService	es	=	new	EventService();
		es.startService();
	}
	
}
