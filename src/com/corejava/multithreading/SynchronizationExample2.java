package com.corejava.multithreading;

import javax.swing.plaf.synth.SynthSpinnerUI;

class Test
{
	
}
class MyRunnable2 implements Runnable
{
	public void run()
	{
		try {
			method1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void method1() throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Current Mehtod threaad: "+Thread.currentThread().getName());
			Thread.sleep(100);
		}
	}
}
class MyRunnable implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Current Thread "+Thread.currentThread().getName());
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
public class SynchronizationExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable obj=new MyRunnable();
		Thread t1=new Thread(obj,"Thread 1");
		Thread t2=new Thread(obj,"Thread 2");
		
		MyRunnable2 obj2=new MyRunnable2();
		Thread t3=new Thread(obj2,"Thread 3");
		Thread t4=new Thread(obj2,"Thread 4");
		t3.start();
		t4.start();
		
		/*t1.start();
		t2.start();*/
		/*Test t=new Test();
		synchronized(t)
		{
			
		}*/
	}

}
