package com.corejava.multithreading.practice1;

class MyRunnable5 implements Runnable
{
	public void run()
	{
		synchronized (String.class) {
			System.out.println("Taken lock on String ..... Waiting for lock on Object class");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (Object.class) {
				System.out.println("Object Lock has acquired");
				
			}
		}
		System.out.println("Ended MyRunnable5");
	}
}

class MyRunnable6 extends Thread
{
	public void run()
	{
		synchronized (Object.class) {
			System.out.println("Taken lock on Object.....waiting for loack in String class");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out.println("String Lock has acquired");
			}
		}
		System.out.println("Ended MyRunnable6");
	}
}

public class DeadLockCreation {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyRunnable5(), "Thread 1");
		Thread t2=new Thread(new MyRunnable6(), "Thread 2");
		t1.start();
		t2.start();
	}

}
