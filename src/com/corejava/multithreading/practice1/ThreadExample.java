package com.corejava.multithreading.practice1;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "Thread :" + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " Thread Implements Runnable " + Thread.currentThread().getName());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		/*
		 * MyThread1 t1 = new MyThread1(); MyThread1 t2 = new MyThread1();
		 * t1.start(); t2.start();
		 */

		System.out.println("----------------------------Runnable ----------------------------------");
		MyRunnable r1 = new MyRunnable();
		Thread t3 = new Thread(r1, "Thread 3");
		Thread t4 = new Thread(r1, "Thread 4");
		t3.start();
		t4.start();
	}

}
