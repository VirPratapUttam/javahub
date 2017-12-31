package com.corejava.multithreading.practice1;
class MyRunnable3 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("MyRunnable3 :"+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MyRunnable4 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("MyRunnable4: "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadHeavyWeightExample {

	public static void main(String[] args) {
		MyRunnable3 r1=new MyRunnable3();
		MyRunnable4 r2=new MyRunnable4();
		Thread t1=new Thread(r1,"Thread 1");
		Thread t2=new Thread(r2, "Thread 2");
		
		t1.start();
		t2.start();
	}

}
