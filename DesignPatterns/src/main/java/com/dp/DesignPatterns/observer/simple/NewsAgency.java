package com.dp.DesignPatterns.observer.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author ysharma
 *
 *THIS IS A SUBJECT CLASS WHICH EXTENDS OVERSVABLE CLASS (THIS DECREASES THE USEABILITY DUE TO ONE WAY CLASSINHERITENCE)
 *
 *ADDNEWS ACCEPTS A NEWS AND CALLS THE LOOP TO NOTIFY THE OBSERVERS
 *
 *REGITERS ADD A NEW NEWS SUBSCRIBER(OBSERVER) TO THE LIST OF OBSERVERS.
 *
 */

public class NewsAgency extends Observable implements Publisher {
	private List<Observer> channels = new ArrayList<>();

	public void addNews(String newsItem) {
		notify(newsItem);
	}
	
	public	void	register(Observer	obsv) {
		channels.add(obsv);
	}
	
	public	void	notify(String	newsItem) {
		for(Observer	o:channels) {
			o.update(this, newsItem);
		}
	}
}
