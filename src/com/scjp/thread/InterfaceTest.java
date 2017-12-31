package com.scjp.thread;

interface Checkable
{
	public void check();
}
class Check
{
	public void check()
	{
		System.out.println("Inside Check");
	}
}

public class InterfaceTest extends Check implements Checkable{

	public static void main(String[] args) {
		InterfaceTest test=new InterfaceTest();
		test.check();
	}
}
