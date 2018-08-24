package com.dp.DesignPatterns.async;

public class CallerThreadCl {
	public	static	void	main(String...	args) {
		new	AsyncThread().start();
	}
}

class	AsyncThread	extends	Thread{
	public	void	run() {
		System.out.println("Running!!");
	}
	
}
