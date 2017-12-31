package com.scjp.thread;

public class Test1 extends Thread{
	@Override
	public void run()
	{
		System.out.println("Run");
	}
	public void start()
	{
		System.out.println("Start");
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.start();
		t1.run();
	}

}
