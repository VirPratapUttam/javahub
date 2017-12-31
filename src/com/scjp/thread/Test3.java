package com.scjp.thread;
class MyThread2 extends Thread
{
	MyThread2()
	{
		System.out.println("1");
	}
	public void run()
	{
		System.out.println("2");
	}
}

public class Test3 {

	public static void main(String[] args) {
		MyThread2 t1=new MyThread2()
				{
					public void run()
					{
						System.out.println("3");
					}
				};
				t1.start();
	}

}
