package com.corejava.simple.jvm;

public class HeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long mb=1024*1024;
		Runtime r=Runtime.getRuntime();
		System.out.println("Max Memory: "+r.maxMemory()/mb);
		System.out.println("Total Memory "+r.totalMemory()/mb);
		System.out.println("Free Memory "+r.freeMemory()/mb);
		long consumedMemory=(r.totalMemory()-r.freeMemory())/mb;
		System.out.println("Consumed Memory "+consumedMemory);

	}

}
