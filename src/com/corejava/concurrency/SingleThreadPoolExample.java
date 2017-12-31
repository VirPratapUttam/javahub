package com.corejava.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable1 implements Callable<Integer>
{
	int number;
	public MyCallable1(Integer number)
	{
		this.number=number;
	}
	public Integer call()
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(number + " "+ Thread.currentThread().getName());
		return number*number;
	}
}

public class SingleThreadPoolExample {

	private static int nThreads=3;
	private static int nTasks=10;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//ExecutorService executor=Executors.newSingleThreadExecutor();
		ExecutorService executor=Executors.newFixedThreadPool(nThreads);
		Future<Integer> f;
		for(int i=1;i<=nTasks;i++)
		{
			f=executor.submit(new MyCallable1(i));
			System.out.println(f.get());
		}
		
	}

}
