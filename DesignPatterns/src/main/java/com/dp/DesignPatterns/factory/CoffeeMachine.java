package com.dp.DesignPatterns.factory;

public class CoffeeMachine extends	DrinksMachine{

	@Override
	public Drink dispenseDrink() {
		return	new	Coffee();
	}
	
}
