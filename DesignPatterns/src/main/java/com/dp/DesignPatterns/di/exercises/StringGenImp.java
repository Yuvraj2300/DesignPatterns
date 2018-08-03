package com.dp.DesignPatterns.di.exercises;

import java.util.Random;

public class StringGenImp implements	StringGen{

	
	final	String[]	charz	=	{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","K",};	
	
	public String generate() {
		Random	rand	=	new	Random();
		int	i	=	rand.nextInt(10);
	
		return charz[i];
	}
	
}
