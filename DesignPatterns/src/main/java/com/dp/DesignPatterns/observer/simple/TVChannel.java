package com.dp.DesignPatterns.observer.simple;

import java.util.Observable;
import java.util.Observer;

public class TVChannel implements	Observer{

	@Override
	public void update(Observable agency, Object newsItem) {
		// TODO Auto-generated method stub
		if(agency instanceof	Publisher) {
			System.out.println(newsItem);
		}
	}

}
