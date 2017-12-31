package com.corejava.multithreading.practice1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable
{
	private BlockingQueue<Integer> sharedQueue;
	public Producer(BlockingQueue<Integer> sharedQueue)
	{
		this.sharedQueue=sharedQueue;
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Produced i: "+i);
			try {
				sharedQueue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable
{
	private BlockingQueue<Integer> sharedQueue;
	public Consumer(BlockingQueue<Integer> sharedQueue)
	{
		this.sharedQueue=sharedQueue;
	}
	public void run()
	{
		while(true)
		{
			try {
				System.out.println("Conusmed "+sharedQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumerBlockingQueueExample {

	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue=new LinkedBlockingQueue<>();
		Producer p1=new Producer(sharedQueue);
		Consumer c1=new Consumer(sharedQueue);
		
		Thread t1=new Thread(p1,"Producer Thread");
		Thread t2=new Thread(c1,"Conusmer Thread");
		
		t1.start();
		t2.start();
	}

}
