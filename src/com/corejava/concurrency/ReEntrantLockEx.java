package com.corejava.concurrency;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Producer1 implements Runnable {
	List<Integer> shareQueue;
	int maxSize = 3;
	Lock lock;
	Condition producerCondition;
	Condition consumerCondition;

	public Producer1(List<Integer> shareQueue, Lock lock, Condition producerCondition, Condition conusmerCondition) {
		this.shareQueue = shareQueue;
		this.lock = lock;
		this.producerCondition = producerCondition;
		this.consumerCondition = conusmerCondition;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			lock.lock();
			if (shareQueue.size() == maxSize) {
				try {
					producerCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			shareQueue.add(i);
			System.out.println("Producer " + i);
			consumerCondition.signal();
			lock.unlock();
		}
	}
}

class Consumer1 implements Runnable {
	List<Integer> sharedQueue;
	Lock lock;
	Condition producerCondition;
	Condition consumerCondition;

	public Consumer1(List<Integer> sharedQueue, Lock lock, Condition pCondition, Condition cCondition) {
		this.sharedQueue = sharedQueue;
		this.lock = lock;
		this.producerCondition = pCondition;
		this.consumerCondition = cCondition;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			lock.lock();
			if (sharedQueue.size() == 0) {
				try {
					consumerCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Consumes :-" + sharedQueue.remove(0));
			producerCondition.signal();
			lock.unlock();
		}
	}

}

public class ReEntrantLockEx {

	public static void main(String[] args) {
		List<Integer> sharedQueue = new LinkedList<>();
		Lock lock = new ReentrantLock();
		Condition producerCondition = lock.newCondition();
		Condition consumerCondition = lock.newCondition();
		
		Producer1 p1=new Producer1(sharedQueue, lock, producerCondition, consumerCondition);
		Consumer1 c1=new Consumer1(sharedQueue, lock, producerCondition, consumerCondition);
		
		Thread t1=new Thread(p1);
		Thread t2=new Thread(c1);
		
		t1.start();
		t2.start();
	}

}
