package com.dp.DesignPatterns.Decorator.plain;

public class Pizza implements	Order{
	private	String	label;
	private	double	price;
		
	public	Pizza(String	label,double	price){
		this.label=label;
		this.price=price;
	}
	
	public String getLabel() {
		return this.label;
	}



	public double getPrice() {
		return this.price;
	}
	
}
