package com.scjp.thread;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSpinnerUI;

class Producer implements Runnable {
	ArrayList<Integer> sharedQueue;

	public Producer() {
		sharedQueue = new ArrayList<>();
	}

	@Override
	public void run() {
		System.out.println("Producer has not started yet");
		synchronized (this) {
			for (int i = 1; i <= 3; i++) {
				sharedQueue.add(i);
				System.out.println("Producer is still producing... "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Finished Producing");
			this.notify();
		}
		
	}

}
class Consumer implements Runnable
{
   Producer prod;
   Consumer(Producer obj)
   {
	   this.prod=obj;
   }
	@Override
	public void run() {
		System.out.println("Not Started Consuming yet");
		synchronized (this.prod) {
			try {
				this.prod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 1; i <= 3; i++) {
			System.out.println("Consumed:- " + this.prod.sharedQueue.remove(0));
		}
	}
	
}

public class ProducerConsumer {

	public static void main(String[] args) {
		Producer p1=new Producer();
		Consumer c1=new Consumer(p1);
		
		Thread t1=new Thread(p1);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();

	}

}
