package com.dp.DesignPatterns.observer.hand;

import java.util.ArrayList;
import java.util.List;

public class MySubject{
	private	List<ObserverHand>	obsv	=	new	ArrayList<>();
	
	public	void	register(ObserverHand	obs) {
		obsv.add(obs);
	}
	
	public	void	deRegister(ObserverHand	obs) {
		obsv.remove(obs);
	}
	
	public	void	addMessage(String	msg) {
		notify(msg);
	}
	
	public	void	notify(String	msg) {
		for(ObserverHand	o:obsv) {
			o.notifyO(msg);
		}
	}
}
