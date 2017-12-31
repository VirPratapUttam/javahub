package com.corejava.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {

	public static void main(String[] args) {
		Set<String> s1=new CopyOnWriteArraySet<>();
		s1.addAll(Arrays.asList("Vir","Rah","Rohit"));
		
		System.out.println("Iterator");
		Iterator<String> itr1=s1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			s1.add("Neha");
		}
		
		System.out.println("List Iterator");
		ListIterator<String> itr2=(ListIterator<String>) s1.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
			s1.add("A");
		}
		
		System.out.println("Enumerator");
		Enumeration<String> e1=Collections.enumeration(s1);
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
			s1.add("T");
		}
		
	}

}
