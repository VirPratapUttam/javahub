package com.corejava.oops;

import java.io.FileNotFoundException;
import java.sql.SQLException;

class A
{
	public void method1()
	{
		System.out.println("A:1");
	}
	public static void method2()
	{
		System.out.println("A:2");
	}
	public Number method3()
	{
		System.out.println("A:3");
		return 3;
	}
	public void method4()
	{
		System.out.println("A:4");
	}
	public void method5() 
	{
		System.out.println("A:5");
	}
	public void method6() throws SQLException
	{
		System.out.println("A:6");
	}
	public void method7() throws SQLException
	{
		System.out.println("A:7");
	}
	public final void method8()
	{
		System.out.println("A:8");
	}
	public A method9()
	{
		System.out.println("A:9");
		return new A();
	}

}
class B extends A
{
	public void method1()
	{
		System.out.println("B:1");
	}
	public static void method2()
	{
		System.out.println("B:2");
	}
	public Integer method3()
	{
		System.out.println("B:3");
		return 4;
	}
	public void method4() throws NullPointerException
	{
		System.out.println("B:4");
	}
	/*public void method5() throws FileNotFoundException
	{
		System.out.println("B:5");
	}*/
	/*public void method6() throws FileNotFoundException
	{
		System.out.println("B:6");
	}*/
	public void method7() 
	{
		System.out.println("B:7");
	}

	/*public final void method8()
	{
		System.out.println("B:8");
	}*/
	public B method9()
	{
		System.out.println("B:9");
		return new B();
	}
}

public class MethodOverriding {
public static void main(String[] args) {
/*	B b=(B) new A();
	b.method1();*/
	
	A a=new B();
	a.method1();
	a.method2();
	System.out.println(a.method3());
	a.method9();
}
}
