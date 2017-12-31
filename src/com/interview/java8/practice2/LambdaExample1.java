package com.interview.java8.practice2;

import java.util.Arrays;
import java.util.List;

public class LambdaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"Vir","Ravi","Neha","Suresh","Twinkle"};
		List<String> nameList=Arrays.asList(names);

		System.out.println("Older Version to print");
		//Older Version
		for(String s:nameList)
			System.out.println(s);
		
		System.out.println("New Version to print 1");
		nameList.forEach(System.out::println);
		
		System.out.println("New Version to print 2");
		nameList.forEach((String s)->System.out.println(s));
		
		System.out.println("New Version to print 3");
		nameList.forEach((s)->System.out.println(s));
		
		//Use Anonymous Inner Class
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Hello Thread");
			}
		}.start();

		//Java 8
		new Thread(()->System.out.println("Hello Java8 Thread")).start();
		
		//Use Anonymous Class
		Runnable r1=new Runnable()
				{
					@Override
					public void run()
					{
						System.out.println("Runnable 1");
					}
				};
		r1.run();
		
		//Java 8
		Runnable r2=()->System.out.println("Runnable 2");
		r2.run();
	}

}
