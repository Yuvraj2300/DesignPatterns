package com.dp.DesignPatterns.Singletons;

import java.lang.reflect.Constructor;

public class ReflectionTest {
	public static void main(String[] args) {
		Class	cls	=	MySingleton.class;
		Constructor[]	cnst	=	cls.getConstructors();
		for(Constructor cns:cnst	) {
			System.out.println(cns.isAccessible());
			System.out.println();
			
			cns.setAccessible(true);
			
			System.out.println(cns.isAccessible());
			
		}
	}
}
