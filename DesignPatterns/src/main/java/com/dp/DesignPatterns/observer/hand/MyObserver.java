package com.dp.DesignPatterns.observer.hand;

public class MyObserver implements	ObserverHand{

	@Override
	public void notifyO(Object msg) {
		System.out.println(msg);
	}

}
