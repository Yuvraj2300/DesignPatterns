package com.dp.DesignPatterns.Decorator.ee;

public interface Product {
	public	void	setPrice(double	price);
	public	void	setLabel(String	label);
	public	String	getLabel();
	public	double	getPrice();
	public	String	generateLabel();
}
