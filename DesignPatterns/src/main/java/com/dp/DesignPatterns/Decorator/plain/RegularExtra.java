package com.dp.DesignPatterns.Decorator.plain;

public class RegularExtra extends	Extra{

	public RegularExtra(String label, double price, Order order) {
		super(label, price, order);
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price+order.getPrice();
	}

}
