package com.scjp.thread;
class MyRunnable1 implements Runnable
{

	@Override
	public void run() {
		System.out.println("Run");
		
	}
	public void start()
	{
		System.out.println("Start");
	}
	
}

public class Test {

	public static void main(String[] args) {
		MyRunnable1 r1=new MyRunnable1();
		Thread t1=new Thread(r1);
		//t1.start();
		t1.run();
	}

}
