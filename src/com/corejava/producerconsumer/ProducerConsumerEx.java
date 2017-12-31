package com.corejava.producerconsumer;

import java.util.LinkedList;
import java.util.List;

class Producer2 implements Runnable
{

	List<Integer> sharedQueue;
	int maxSize=2;
	public Producer2(List<Integer> shareQueue)
	{
		this.sharedQueue=shareQueue;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			synchronized (sharedQueue) {
				if(sharedQueue.size()==2)
				{
					try {
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Produces :-"+i);
				sharedQueue.add(i);
				sharedQueue.notify();
			}
		}
	}
	
}
class Consumer2 implements Runnable
{
	List<Integer> sharedQueue;
	public Consumer2(List<Integer> sharedQueue)
	{
		this.sharedQueue=sharedQueue;
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			synchronized (sharedQueue) {
				if(sharedQueue.size()==0)
				{
					try {
						sharedQueue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Consume :-"+sharedQueue.remove(0));
				sharedQueue.notify();
			}
			
		}
	}
	
}

public class ProducerConsumerEx {

	public static void main(String[] args) {
		List<Integer> sharedQueue=new LinkedList<>();
		Producer2 p1=new Producer2(sharedQueue);
		Consumer2 c1=new Consumer2(sharedQueue);
		Thread t1=new Thread(p1);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}

}
