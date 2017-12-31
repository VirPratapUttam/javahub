package com.scjp.thread;
class MyRunnable2 implements Runnable
{

	@Override
	public void run() {
		//synchronized (this) {
		for(int i=0;i<3;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("x");
	//	}
		}
		
	}
	
}

public class JoinTest {

	public static void main(String[] args) throws InterruptedException {
		
		/*Thread t1=new Thread(new MyRunnable2());
		Thread t2=new Thread(new MyRunnable2());
		
		t1.start();
		t2.start();*/
		
		
		
		
		MyRunnable2 r1=new MyRunnable2();
		
		Thread t3=new Thread(r1);
		Thread t4=new Thread(r1);
		
		t3.start();
		t3.join();
		t4.start();
		t4.join();
		
		System.out.println("End");
	}

}
