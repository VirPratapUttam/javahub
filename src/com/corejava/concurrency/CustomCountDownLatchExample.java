package com.corejava.concurrency;

class MyRunnable2<T> implements Runnable
{
	T countDownLatch;
	public MyRunnable2(T countDownLatch)
	{
		this.countDownLatch=countDownLatch;
	}

	@Override
	public void run() {
		for(int i=2;i>=0;i--)
		{
			((CustomCountDownLatch) countDownLatch).countDown();
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

public class CustomCountDownLatchExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		CustomCountDownLatch countDownLatch=new CustomCountDownLatch(3);
		System.out.println("Count down latch has been created with 3 count");
		new Thread(new MyRunnable2(countDownLatch)).start();
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("count has reached zero, "+
                Thread.currentThread().getName()+" thread has ended");
	}

}
