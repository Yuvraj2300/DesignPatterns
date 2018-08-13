package com.dp.DesignPatterns.Decorator.ee;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

public class MainEE {
	

	@Any
	@Inject
	Product	product;
	
	public static void main(String[] args) {
		MainEE	m	=	new	MainEE();
		m.createProductList();
	}
	
	private void createProductList() {
		// TODO Auto-generated method stub
		System.out.println("Label: " + product.generateLabel());
	}

	@PostConstruct
	public	void	init() {
		if(product==null) {
			product	=	new	PriceDiscountDecorator();
		}
	}
	
}
