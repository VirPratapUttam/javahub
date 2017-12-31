package com.corejava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable
{
	int taskNumber;
	public MyRunnable(int taskNo)
	{
		this.taskNumber=taskNo;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is executing Task : "+taskNumber);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ExecutorServiceExample {
	private static int nThreads=2;
	private static int nTasks=10;
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(nThreads);
		System.out.println("Executor created 2 new");
		System.out.println("2 Thread in executor using 10 tasks");
		for(int i=1;i<=nTasks;i++)
		{
			executor.execute(new MyRunnable(i));
		}
		executor.shutdown();
		System.out.println("Executor has been shutdown");
	}

}
