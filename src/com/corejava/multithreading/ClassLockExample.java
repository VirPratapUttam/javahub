package com.corejava.multithreading;

import javax.swing.plaf.synth.SynthSpinnerUI;

class MyRunnable3 implements Runnable {
	public void run() {
		synchronized (MyRunnable.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i+ " MyRunnable3: Current Thread :" + Thread.currentThread().getName());
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
class MyRunnable4 implements Runnable
{
	public void run()
	{
		method1();
	}
	public static synchronized void method1()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" MyRunnable3: Current Thread :"+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ClassLockExample {

	public static void main(String[] args) {
		// MyRunnable3 mr3=new MyRunnable3();

		/*Thread t1 = new Thread(new MyRunnable3(), "Thread 1");
		Thread t2 = new Thread(new MyRunnable3(), "Thread 2");
		t1.start();
		t2.start();*/
		
		Thread t3=new Thread(new MyRunnable4(),"Thread 3");
		Thread t4=new Thread(new MyRunnable4(),"Thread 4");
		t3.start();
		t4.start();
	}

}
