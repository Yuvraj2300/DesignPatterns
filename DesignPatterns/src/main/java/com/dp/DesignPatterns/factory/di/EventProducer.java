package com.dp.DesignPatterns.factory.di;

import javax.enterprise.inject.Produces;

public class EventProducer {
	
	@Produces
	public	MessageA	getMessageA() {
		return	new	MessageA();
	}
	
	@Produces
	public	MessageB	getMessageB() {
		return	new	MessageB();
	}
}
