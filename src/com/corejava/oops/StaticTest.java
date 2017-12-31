package com.corejava.oops;
class Check
{
	static{
		System.out.println("A");
	}
	{
		System.out.println("B");
	}
	
	public Check()
	{
		System.out.println("C");
	}
}

public class StaticTest {
	

	public static void main(String[] args) {
		Check c=new Check();
	}

}
