package com.corejava.simple.multithreading;

class Worker implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class ThreadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Worker());
		Thread t2=new Thread(new Worker());
		t1.start();
		t2.start();
	}

}
