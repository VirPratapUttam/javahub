package com.corejava.simple.multithreading;
class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Thread Started::"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread ended:::"+Thread.currentThread().getName());
	}
}
public class ThreadJoinExample {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyRunnable(),"t1");
		Thread t2=new Thread(new MyRunnable(),"t2");
		Thread t3=new Thread(new MyRunnable(),"t3");
		
		t1.start();
		
		try {
			t1.join(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
