package com.dp.DesignPatterns.Decorator.plain;

public class MainDecorator {
	public static void main(String... args) {
		Order fourSeasonsPizza = new Pizza("Four Seasons Pizza", 10);
		fourSeasonsPizza =  new RegularExtra("Pepperoni", 4, fourSeasonsPizza);
		fourSeasonsPizza =  new DoubleExtra("Mozzerella", 2, fourSeasonsPizza);
		fourSeasonsPizza =  new NoCostExtra("Chili", 2, fourSeasonsPizza);

		System.out.println(fourSeasonsPizza.getPrice());
		System.out.println(fourSeasonsPizza.getLabel());
	}
}
