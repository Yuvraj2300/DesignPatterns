package com.dp.DesignPatterns.factory;

public class SoftDrinkMachine extends	DrinksMachine{

	@Override
	public Drink dispenseDrink() {
		// TODO Auto-generated method stub
		return new	SoftDrink();
	}

}
