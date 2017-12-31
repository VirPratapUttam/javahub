package com.corejava.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "A");
		m1.put(2, "B");
		m1.put(3, "C");
		
		/*Set<Integer> s1=m1.keySet();
		Iterator<Integer> itr1=s1.iterator();
		
		while(itr1.hasNext())
		{
			m1.put(4, "D");
			System.out.println(itr1.next());
		}*/
		
		Collection<String> s1=m1.values();
		Iterator<String> itr2=s1.iterator();
		while(itr2.hasNext())
		{
			m1.put(4, "Test");
			System.out.println(itr2.next());
		}
		
	}

}
