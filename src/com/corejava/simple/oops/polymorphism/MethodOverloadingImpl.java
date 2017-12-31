package com.corejava.simple.oops.polymorphism;
//In java, Method Overloading is not possible by changing the return type of the method only.
class Machine
{
	public void setParts(int x,int y)
	{
		System.out.println("Inside Set Parts 1");
	}
	public void setParts(String x,String y)
	{
		System.out.println("Inside Set Parts 2");
	}
}

class Calculate1
{
	public void sum(int x,int y,int z)
	{
		System.out.println("Method 1");
	}
	public void sum(int x,long y)
	{
		System.out.println("Method 2");
	}
}
class Calculate2
{
	/*public void sum(int x,int y)
	{
		System.out.println("Method 3");
	}*/
	public void sum(int x,long y)
	{
		System.out.println("Method 4");
	}
}
class Calculate3
{
	public void sum(int x,long y)
	{
		System.out.println("Method 5");
	}
	public void sum(long x,int y)
	{
		System.out.println("Method 6");
	}
}

public class MethodOverloadingImpl {

	public static void main(String[] args) {
		Machine m=new Machine();
		m.setParts(10,20);
		m.setParts("a", "b");
		
		Calculate1 c1=new Calculate1();
		Calculate2 c2=new Calculate2();
		Calculate3 c3=new Calculate3();
		

		c1.sum(10, 20, 30);
		c1.sum(10, 20);
		c2.sum(10, 10);
	// Ambiguity	
	//	c3.sum(10, 20);
	}

}
