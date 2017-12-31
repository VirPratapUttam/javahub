package com.corejava.multithreading;

public class Multi implements Runnable{
	public void run()
	{
		System.out.println("Thread running");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi m1=new Multi();
		
		Thread t1=new Thread(new Multi());
		Thread t2=new Thread(m1);
		t1.start();
		t2.start();

	}

}
