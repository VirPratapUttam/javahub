package com.corejava.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer>
{
	private Integer i;
	public MyCallable(Integer i)
	{
		this.i=i;
	}
	public Integer call()
	{
		return i*i;
	}
}
class DoubleCallable implements Callable<Double>
{
	Double d;
	public DoubleCallable(Double d)
	{
		this.d=d;
	}
	
	public Double call()
	{
		return d*d;
	}
}
public class CallableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		Future<Integer> integerSquare=executor.submit(new MyCallable(4));
		Future<Double> doubleSquare=executor.submit(new DoubleCallable(2.2));
		
		System.out.println(integerSquare.get());
		System.out.println(doubleSquare.get());
		
		executor.shutdown();
	}

}
