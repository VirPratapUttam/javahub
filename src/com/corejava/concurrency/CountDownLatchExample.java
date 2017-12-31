package com.corejava.concurrency;

import java.util.concurrent.CountDownLatch;

class MyRunnable1<T> implements Runnable
{
	T countDownLatch;
	public MyRunnable1(T countDownLatch)
	{
		this.countDownLatch=countDownLatch;
	}

	@Override
	public void run() {
		for(int i=2;i>=0;i--)
		{
			((CountDownLatch) countDownLatch).countDown();
			System.out.println(Thread.currentThread().getName()+
                    " has reduced latch count to : "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
public class CountDownLatchExample {

	public static void main(String[] args) {
		CountDownLatch countDownLatch=new CountDownLatch(3);
		System.out.println("Count down latch has been created with 3 count");
		new Thread(new MyRunnable1(countDownLatch)).start();
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("count has reached zero, "+
                Thread.currentThread().getName()+" thread has ended");
	}

}
