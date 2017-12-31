package com.interview.java8;
interface  P{
    default void hello() { System.out.println("Hello World from A"); }
}
interface Q {
    default void hello() { System.out.println("Hello World from B"); }
}


public class DefaultMethodTesting implements Q,P{

	public static void main(String[] args) {
		 new DefaultMethodTesting().hello();
	}
	
	 public void hello() { P.super.hello(); }

}
