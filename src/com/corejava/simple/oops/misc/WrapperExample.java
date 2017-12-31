package com.corejava.simple.oops.misc;

public class WrapperExample {

	public static void main(String[] args) {
		int a=20;
		Integer i=Integer.valueOf(a);
		Integer j=a; // Auto Boxing
		
		System.out.println("i is:- "+i+"j is:"+j);
		
		Integer xa=30;
		int m=xa;
		int n= xa.intValue();
		System.out.println("m is :-"+m+"n is:"+n);
	}

}
