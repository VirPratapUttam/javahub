package com.corejava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	private String message;

	public WorkerThread(String message) {
		this.message = message;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + "Start message"
				+ message);
		processMsg();
		System.out.println(Thread.currentThread().getName() + "End message");
	}

	public void processMsg() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
	}
}

public class ThreadPoolImpl {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		for(int i=1;i<=20;i++)
		{
			Runnable worker=new WorkerThread(""+i);
			executor.execute(worker);
		}
		executor.shutdown();
		
		while(!executor.isTerminated()){}
		System.out.println("All thread are completed");
		

	}

}
