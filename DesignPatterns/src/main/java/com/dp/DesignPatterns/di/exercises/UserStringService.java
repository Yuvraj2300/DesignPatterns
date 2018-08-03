package com.dp.DesignPatterns.di.exercises;

import javax.inject.Inject;

public class UserStringService {
	
	@Inject
	StringGen	stringGen;
	
	public	String	retString(StringGen	stringGen) {
		return	stringGen.generate();
	}
	
}
