package com.corejava.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Result
{
	public Integer code;
	public String message; 
}

class ThreadTask implements Callable<Result>
{
	public Result call()
	{
		Result response=new Result();
		response.code=200;
		response.message="Success";
		return response;
	}
}
public class MultiCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		ThreadTask task=new ThreadTask();
		Future<Result> resultObject=executor.submit(task);
		Result result=null;
		try {
			result=resultObject.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result.code+"   "+result.message);
		executor.shutdown();
	}

}
