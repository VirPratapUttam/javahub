package com.corejava.simple.multithreading;
class Thread2 extends Thread
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class Thread2Example extends Thread {
	public static void main(String[] args) {
		Thread2 t1=new Thread2();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}
