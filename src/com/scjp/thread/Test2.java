package com.scjp.thread;

import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		MyRunnable2 r1=new MyRunnable2();
		Thread t1=new Thread(r1);
		t1.start();
		 System.out.println("press enter");
         System.in.read();
         t1.interrupt();
				
	
	}

}
