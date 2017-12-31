package com.interview.java8;

interface Test
{
	void say();
}
class A
{
	public void method1()
	{
		System.out.println("Method1");
	}
	public static void method2()
	{
		System.out.println("Static method: method2");
	}
	public int method5(int a,int b)
	{
		return a+b;
	}
}

class B extends A
{
	public void method3()
	{
		System.out.println("Method3");
	}
	public static void method4()
	{
		System.out.println("Method4");
	}
}
public class MethodReferenceTest {

	public static void main(String[] args) {
		Test a1=new A()::method1;
		a1.say();
		Test a2=A::method2;
		a2.say();
	}

}
