package com.corejava.multithreading.practice1;

public class DeadLockCreationUsingInnerClass {

	public static void main(String[] args) {
		Thread t1=new Thread("Thread 1"){
			public void run()
			{
				synchronized (String.class) {
					System.out.println("Taken Lock on String...Waiting for Object Lock");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (Object.class) {
						System.out.println("Taken Lock on Object");
						
					}
				}
				System.out.println("Thread 1 Ended");
			}
		};
		
		Thread t2=new Thread("Thread 2"){
			public void run()
			{
				synchronized (Object.class) {
					System.out.println("Taken Lock on Object....Waiting lock on String");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (String.class) {
						System.out.println("Taken Lock on String");
					}
				}
				System.out.println("Thread 2...ended");
			}
		};
		t1.start();
		t2.start();
	}

}
