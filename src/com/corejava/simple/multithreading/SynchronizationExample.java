package com.corejava.simple.multithreading;
class ProcessingThread implements Runnable
{
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			processSomething(i);
			count++;
		}
	}

	private void processSomething(int i) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

public class SynchronizationExample {
	public static void main(String[] args) {
		ProcessingThread pt=new ProcessingThread();
		Thread t1=new Thread(pt);
		t1.start();
		
		Thread t2=new Thread(pt);
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is-"+pt.getCount());
	}
}
