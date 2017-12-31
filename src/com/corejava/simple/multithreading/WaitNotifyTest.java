package com.corejava.simple.multithreading;

public class WaitNotifyTest {

	public static void main(String[] args) {
		Message m=new Message("Process it");
		Waiter waiter1=new Waiter(m);
		new Thread(waiter1,"waiter1").start();
		
		Waiter waiter2=new Waiter(m);
		new Thread(waiter2,"waiter2").start();
		
		Notifier notifier=new Notifier(m);
		new Thread(notifier,"notifier").start();
		
		System.out.println("All Thread Finished");
		
	}

}
