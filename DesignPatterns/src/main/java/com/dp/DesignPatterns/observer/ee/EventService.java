package com.dp.DesignPatterns.observer.ee;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.dp.DesignPatterns.observer.ee.MessageEvent.Type;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {

	@Inject
	private String message = "produced Message";

	@Inject
	@MessageEvent(Type.SERVICE)
	Event<String> serviceEvent;

	@Inject
	@MessageEvent(Type.PARAMETER)
	Event<String>	parameterEvent;
	
	public void startService() {
		serviceEvent.fire("Starting Service: " + message);
		parameterEvent.fire("-d -p");
	}

}
