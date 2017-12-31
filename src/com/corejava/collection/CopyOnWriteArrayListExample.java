package com.corejava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListExample {

	public static void main(String[] args) {
	List<String> l1=new ArrayList<>();
	l1.addAll(Arrays.asList("Vir","Raj","Suresh"));
	
	//Fail Fast Iterator
	/*Iterator itr1=l1.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
		l1.add("Neha");
	}*/
	//Fail Safe
	List<String> l2=new CopyOnWriteArrayList<>();
	l2.addAll(Arrays.asList("Vir","Raj","Suresh"));
	Iterator<String> itr2=l2.iterator();
	
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
		l2.add("Rohit");
	}
	
	ListIterator<String> itr3=l2.listIterator();
	
	while(itr3.hasNext())
	{
		l2.add("Ra");
		System.out.println(itr3.next());
	}
	
	Enumeration<String> e1=Collections.enumeration(l2);
	System.out.println("-------------------------------");
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
		l2.add("Angel");
	}
 	
	System.out.println("Java Iterator");
	l2.forEach(System.out::println);
	
	}

}
