package com.scjp.thread;

import javax.swing.plaf.synth.SynthSpinnerUI;

class MyRunnable3 implements Runnable
{

	@Override
	public void run() {
		System.out.println("1 ");
		synchronized(this)
		{
			try
			{
				this.wait();
			}
			catch(InterruptedException e)
			{
				
			}
		
		}
	}
	
}

public class FrozenProcess {

	public static void main(String[] args) {
		MyRunnable3 r1=new MyRunnable3();
		Thread t1=new Thread(r1);
		t1.start();
	}

}
