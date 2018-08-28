package com.dp.DesignPatterns.observer.ee;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

import com.dp.DesignPatterns.observer.ee.MessageEvent.Type;

@Stateless
public class TraceObserver {
	public	void	serviceTrace(@Observes	@MessageEvent(Type.SERVICE)String	message) {
		System.out.println("Service Message : "+ message);
	}
	
	public	void	parameterTrace(@Observes	@MessageEvent(Type.PARAMETER)String	message) {
		System.out.println("with parameters : "+ message);
	}
}
