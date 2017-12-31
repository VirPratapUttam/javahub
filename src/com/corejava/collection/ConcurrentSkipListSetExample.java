package com.corejava.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;


public class ConcurrentSkipListSetExample {

	public static void main(String[] args) {
		Set<String> s1=new ConcurrentSkipListSet<>();
		s1.add("Vir");
		s1.add("Ravi");
		s1.add("Rohit");
		s1.add("Angel");
		
		System.out.println("Iterator");
		Iterator<String> itr=s1.iterator();
		while(itr.hasNext())
		{
			s1.add("R");
			System.out.println(itr.next());
		}
		
		System.out.println("Enumerator");
		Enumeration<String> e1=Collections.enumeration(s1);
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
			s1.add("E");
		}
		
		System.out.println("For Each");
		for(String s:s1)
		{
			System.out.println(s);
			s1.add("F");
		}
		
		/*ListIterator<String> itr2=s1.l
		while(itr2.hasNext())
		{
			System.out.println(itr.next());
			
		}*/
	}

}
