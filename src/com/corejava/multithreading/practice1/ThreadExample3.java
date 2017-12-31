package com.corejava.multithreading.practice1;

public class ThreadExample3 {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<5;i++)
				{
					System.out.println("Thread :-"+Thread.currentThread().getName());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		
		Runnable task1=()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Javaa 8 Thread :-"+Thread.currentThread().getName());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		new Thread(task1).start();;
	}

}
