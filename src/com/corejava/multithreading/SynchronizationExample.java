package com.corejava.multithreading;

class SynchronizationExample {
	private static SynchronizationExample synchronizationExample = null;

	public static void main(String ar[]) {
		hello();
	}

	private static void hello() {
		synchronized (synchronizationExample) {
			System.out.println("Inside synchronized block");
		}
	}
}