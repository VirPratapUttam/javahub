package com.corejava.simple.oops.polymorphism;
class OverLoadTest
{
	public static  void doSomething(Object obj) {
	    System.out.println("Object called");
	}

	public static  void doSomething(char[] obj) {
	    System.out.println("Array called");
	}

	public static  void doSomething(Integer obj) {
	    System.out.println("Integer called");
	}
	public static  void doSomething(String obj) {
	    System.out.println("String called");
	}
}
public class MethodOverloading1Example {

	public static void main(String[] args) {
		OverLoadTest.doSomething((String)null);

	}

}
