package com.corejava.simple.oops.polymorphism;
class FinalTest
{
	final int speedTest;
	final static int data;
	
	static{
		data=10;
	}
	public FinalTest()
	{
		speedTest=100;
	}
	public int sum(final int x,final int y)
	{
		// If you declare any parameter as final, you cannot change the value of it.
		//x=x+y;
		return x+y;
	}
}
public class FinalClassImpl {

	public static void main(String[] args) {
		FinalTest ft=new FinalTest();
		System.out.println(FinalTest.data);
		System.out.println(ft.speedTest);
	}
}
