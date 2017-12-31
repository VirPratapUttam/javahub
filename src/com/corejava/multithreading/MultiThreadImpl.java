package com.corejava.multithreading;

import java.util.concurrent.TimeUnit;

public class MultiThreadImpl extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*MultiThreadImpl thread1 = new MultiThreadImpl();
		thread1.start();
		MultiThreadImpl thread2 = new MultiThreadImpl();
		thread2.start();*/
		
		MultiThreadImpl thread4 = new MultiThreadImpl();
		MultiThreadImpl thread5 = new MultiThreadImpl();
		MultiThreadImpl thread6 = new MultiThreadImpl();
		thread4.start();
		try {
			thread4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread5.start();
		thread6.start();
		
	}

}
