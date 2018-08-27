package com.dp.DesignPatterns.observer.simple;

public class MainRun {
	public static void main(String[] args) {
		RadioChannel	radio	=	new	RadioChannel();
		NewsAgency	agency	=	new	NewsAgency();
		
		agency.register(radio);
		
		agency.addNews("BREAKING NEWS : Sampit Patra fucks Rahul Gandhi");
		agency.addNews("BREAKING NEWS : DMK dissolved as a result of coup by army.");
		agency.addNews("BREAKING NEWS : Donald Trump Impeached !!!");
		
	//	radio.update(agency, );
		
	}
}
