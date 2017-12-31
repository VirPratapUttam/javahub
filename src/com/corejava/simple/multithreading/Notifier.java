package com.corejava.simple.multithreading;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Notifier implements Runnable{
	private Message msg;

	public Notifier(Message m) {
		this.msg = m;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg(name+" Notifier Work Done");
				msg.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " Finished");
	}

}
