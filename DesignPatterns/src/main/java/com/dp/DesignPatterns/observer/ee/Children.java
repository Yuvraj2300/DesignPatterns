package com.dp.DesignPatterns.observer.ee;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class Children {
	@Resource
	SessionContext sc;

	@Inject
	Event<String> message;

	int[] children = new int[3];

	public void getSixthChild() {
		try {
			int sixthChild = children[5]; // Throws an IndexOutOfBounds Exception
		} catch (Exception e) {
			message.fire("Rollback event occurred.");
			System.out.println("Exception caught.");
			sc.setRollbackOnly();
		}
	}

	public void getThirdChild() {
		int thirdChild = children[2]; // Succeeds
		message.fire("Successful event");
	}
}
