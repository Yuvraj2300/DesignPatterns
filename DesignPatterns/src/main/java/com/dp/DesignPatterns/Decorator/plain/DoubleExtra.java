package com.dp.DesignPatterns.Decorator.plain;

public class DoubleExtra extends Extra {
	public DoubleExtra(String label, double price, Order order) {
		super(label, price, order);
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return (this.price * 2) + order.getPrice();
	}

	public String getLabel() {
		return order.getLabel() + ", Double " + this.label;
	}
}
