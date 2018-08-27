package com.dp.DesignPatterns.observer.ee;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {

	@Inject
	private	String	message;
	
	@Inject
	Event<String>	event;
	
	public	void	startService() {
		event.fire("Starting Service: "+message);
	}
	
}
