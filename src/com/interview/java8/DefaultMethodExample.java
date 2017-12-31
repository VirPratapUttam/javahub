package com.interview.java8;

import java.util.ArrayList;
import java.util.List;

interface Apple
{
	static void print()
	{
		System.out.println("Print");
	}
}
interface Ball
{
	default void print()
	{
		System.out.println("Print");
	}
}

public class DefaultMethodExample implements Apple{

	public static void main(String[] args) {
		Apple.print();
		//List<String> l1=new ArrayList<String>();
	}

}
