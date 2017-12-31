package com.corejava.simple.oops.polymorphism;

class OverloadTest
{
	public void method1(int a,int b)
	{
		System.out.println("int,int");
	}
	public void method1(long a,long b)
	{
		System.out.println("long,long");
	}
	public void method1(int a,int b,int c)
	{
		System.out.println("int,int,int");
	}
	public void method1(long a,int b)
	{
		System.out.println("long,int");
	}
	public void method2(long a)
	{
		System.out.println("long");
	}
	public void method2(Integer i)
	{
		System.out.println("Integer");
	}
	/*public void method3(long a,long b)
	{
		System.out.println("Method3:long,long");
	}*/
	public void method3(Integer i,Integer j)
	{
		System.out.println("Method3: Integer,Integer");
	}
	public void method3(int... x)
	{
		System.out.println("Method:int...");
	}
	//public 
	/*public int method1(int x,int y)
	{
		System.out.println("Method4");
		return x+y;
	}*/
}
public class MethodOverloadingExample {

	public static void main(String[] args) {
		OverloadTest t1=new OverloadTest();
		t1.method1(10, 20);
		t1.method1(10L, 5);
		t1.method2(10);
		t1.method3(10, 10);
	}

}
