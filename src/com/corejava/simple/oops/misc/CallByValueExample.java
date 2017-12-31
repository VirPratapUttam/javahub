package com.corejava.simple.oops.misc;
class Operation
{
	int data=100;
	public void sum(int data)
	{
		data=data+100;
	}
}

public class CallByValueExample {

	public static void main(String[] args) {
		Operation o=new Operation();
		System.out.println(o.data);
		o.sum(10);
		System.out.println(o.data);
	}

}
