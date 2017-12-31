package com.corejava.simple.multithreading;
class  MultithreadingDemo extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

public class MultiThreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			MultithreadingDemo demo=new MultithreadingDemo();
			demo.start();
			
		}

	}

}
