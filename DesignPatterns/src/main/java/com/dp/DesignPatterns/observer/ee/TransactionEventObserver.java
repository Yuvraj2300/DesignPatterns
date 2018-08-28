package com.dp.DesignPatterns.observer.ee;

import javax.enterprise.event.*;
import javax.enterprise.event.TransactionPhase;

public class TransactionEventObserver {

	public	void	onInProgress(@Observes	String	msg) {
		System.out.println("In progress message: "+msg);
	}
	
	public	void	onSuccess(@Observes(during=TransactionPhase.AFTER_SUCCESS)String	msg) {
		System.out.println("After Success msg: "+msg);
	}
	
	public	void	onFailure(@Observes(during=TransactionPhase.AFTER_FAILURE)	String	msg) {
		System.out.println("After failure msg: "+msg);
	}
	
	public	void	onCompletion(@Observes(during=TransactionPhase.AFTER_COMPLETION)	String	msg) {
		System.out.println("After completion "+msg);
	}
}
