package com.corejava.simple.multithreading;

public class MultiThreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Runnable(){
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
			}
		});
		
		Thread t2=new Thread(new Runnable(){
			public void run()
			{
				System.out.println("Thread 2 "+Thread.currentThread().getName());
			}
		});
		
		t1.start();
		t2.start();
		
		Thread t3=new Thread(()->{System.out.println("Inside Runnable");});
		t3.start();
		
		Thread t4=new Thread(()->{System.out.println(Thread.currentThread().getName());});
		t4.start();

	}

}
