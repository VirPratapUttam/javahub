package com.corejava.oops;
interface AC
{
	
}
abstract class ABTest{
	public abstract void test();
	public ABTest()
	{
		System.out.println("Test");
	}
}
class ChildTest extends ABTest
{
	public ChildTest()
	{
		System.out.println("Child Test");
	}
	public void test()
	{
		System.out.println("Inside Test");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		ChildTest cht=new ChildTest();
	}

}
