package com.corejava.multithreading.practice1;

class MyRunnable2 implements Runnable {
	@Override
	public void run() {
		display();
	}

	public void display() {
		synchronized (MyRunnable2.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " Thread " + Thread.currentThread().getName());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {
		MyRunnable2 r1 = new MyRunnable2();
		MyRunnable2 r2 = new MyRunnable2();
		Thread t1 = new Thread(r1, "Thread 1");
		Thread t2 = new Thread(r1, "Thread 2");
		Thread t3 = new Thread(r1, "Thread 3");
		Thread t4 = new Thread(r2, "Thread 4");
		Thread t5 = new Thread(r2, "Thread 5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
