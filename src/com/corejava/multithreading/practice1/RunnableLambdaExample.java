package com.corejava.multithreading.practice1;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		Runnable task1=()->{
			for(int i=0;i<5;i++)
			{
				System.out.println(i+" Thread :"+Thread.currentThread().getName());
			}
		};
		
		new Thread(task1).start();
	}

}
