package com.scjp.thread;
class MyRunnable implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<3;i++)
		{
			System.out.print(i+"..");
		}
		
	}
	
}

public class MyThread {

	public static void main(String[] args) {
		MyRunnable r1=new MyRunnable();
		MyRunnable r2=new MyRunnable();;
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		

	}

}
