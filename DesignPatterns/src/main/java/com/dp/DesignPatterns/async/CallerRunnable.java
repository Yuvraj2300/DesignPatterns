package com.dp.DesignPatterns.async;

public class CallerRunnable {
	public static void main(String[] args) {
		new	Thread(new	AsyncRunnable()).start();;
	}
}

class AsyncRunnable implements	Runnable{
	public	void	run() {
		System.out.println("Running");
	}
}
/*




class	Caller{
	
}
*/