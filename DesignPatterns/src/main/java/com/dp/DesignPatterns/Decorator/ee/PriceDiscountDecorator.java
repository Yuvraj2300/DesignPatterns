package com.dp.DesignPatterns.Decorator.ee;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class PriceDiscountDecorator	implements	Product {

	@Any
	@Inject
	@Delegate
	private	Product	product;


	
	public String generateLabel() {
		product.setPrice(product.getPrice()*0.5);
		product.setLabel(product.getLabel()+"(Discounted)");
		return product.generateLabel();
	}
	
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		
	}

	public void setLabel(String label) {
		// TODO Auto-generated method stub
		
	}

	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
