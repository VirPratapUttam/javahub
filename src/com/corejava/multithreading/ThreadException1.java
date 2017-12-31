package com.corejava.multithreading;

public class ThreadException1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Default Exception Handler :Thread Name :"
						+ t.getName() + " Message :" + e.getMessage());
			}
		});

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				throw new RuntimeException("I am RuntimeException");
			}
		});
		t1.start();
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Exception from main thread
			throw new RuntimeException("I am RuntimeException");
		}
	}
}
