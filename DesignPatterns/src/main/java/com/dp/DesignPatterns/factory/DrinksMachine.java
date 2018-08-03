package com.dp.DesignPatterns.factory;

public abstract	class DrinksMachine {
	public	abstract	Drink	dispenseDrink();
	
	public	String	displayMessage() {
		return	"Thanks for your custom!";
	}
}
