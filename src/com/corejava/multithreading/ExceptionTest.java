package com.corejava.multithreading;

public class ExceptionTest {

	public static void main(String ar[]) {
		System.out.println(hello());
	}

	private static int hello() {
		try {
			throw new RuntimeException("dwed");
		} finally {
			return 10;
		}
	}
}
