package com.dp.DesignPatterns.observer.hand;

public class Run {
	public static void main(String[] args) {
		MyObserver	obs	=	new	MyObserver();
		MySubject	sub	=	new	MySubject();
		
		sub.register(obs);
		sub.addMessage("YOLO");
		sub.addMessage("LOL");
		sub.addMessage("LMAO");
		
	}
}
