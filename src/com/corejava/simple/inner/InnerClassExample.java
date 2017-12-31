package com.corejava.simple.inner;
class Outer
{
	private int data=30;
	class Inner
	{
		public void msg()
		{
			System.out.println("Data is :-"+data);
		}
	}
}

public class InnerClassExample {

	public static void main(String[] args) {
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.msg();
	}

}
