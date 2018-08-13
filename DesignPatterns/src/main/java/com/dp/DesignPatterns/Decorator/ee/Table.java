package com.dp.DesignPatterns.Decorator.ee;

public class Table implements	Product{
	
	private double price = 100.00;
	private String label = "Dining Table";

	public void setPrice(double price) {
		this.price	=	price;
	}

	public void setLabel(String label) {
		this.label	=	label;
	}

	public String getLabel() {
		// TODO Auto-generated method stub
		return label;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public String generateLabel() {
		// TODO Auto-generated method stub
		return price+", "+label;
	}

}
