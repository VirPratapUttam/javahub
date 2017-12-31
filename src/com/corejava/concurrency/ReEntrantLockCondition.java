package com.corejava.concurrency;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Producer implements Runnable
{
	List<Integer> sharedQueue;
	int maxSize=2;
	Lock lock;
	Condition producerCondition;;
	Condition consumerCondition;;
	public Producer(List<Integer> shareQueue,Lock lock,Condition producerCondition,Condition consumerCondition)
	{
		this.sharedQueue=shareQueue;
		this.lock=lock;
		this.producerCondition=producerCondition;
		this.consumerCondition=consumerCondition;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			try {
				produces(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void produces(int i) throws InterruptedException 
	{
		lock.lock();
		if(sharedQueue.size()==maxSize)
		{
			producerCondition.await();
		}
		System.out.println("Produces :"+i);
		sharedQueue.add(i);
		consumerCondition.signal();
		lock.unlock();
	}
	
}

class Consumer implements Runnable
{
	List<Integer> sharedQueue;
	
	Lock lock;
	Condition producerCondition;
	Condition consumerCondition;
	
	
	public Consumer(List<Integer> sharedQueue,Lock lock,Condition pCondition,Condition cCondition)
	{
		this.sharedQueue=sharedQueue;
		this.lock=lock;
		this.producerCondition=pCondition;
		this.consumerCondition=cCondition;
	}


	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			try {
				consume(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	private void consume(int i) throws InterruptedException {
		lock.lock();
		
		if(sharedQueue.size()==0)
		{
			consumerCondition.await();
		}
		
		System.out.println("Cousume i:"+sharedQueue.remove(0));
		producerCondition.signal();
		lock.unlock();
	}
}

public class ReEntrantLockCondition {

	public static void main(String[] args) {
		List<Integer> shareQueue=new LinkedList<>();
		Lock lock=new ReentrantLock();
		Condition producerCondition=lock.newCondition();
		Condition consumerCondition=lock.newCondition();
		Producer p1=new Producer(shareQueue,lock,producerCondition,consumerCondition);
		Consumer c1=new Consumer(shareQueue,lock,producerCondition,consumerCondition);
		
		Thread t1=new Thread(p1,"Thread 1");
		Thread t2=new Thread(c1,"Thread 2");
		
		t1.start();
		t2.start();

	}

}
