package com.dp.DesignPatterns.Singletons;

public class MySingleton {
	private	static	MySingleton	instance;
	
	private	MySingleton() {};
	
	public static MySingleton getInstance() {
		if (instance == null) {
			synchronized (MySingleton.class) {
				instance = new MySingleton();
			}
		}
		return instance;
	}
}
