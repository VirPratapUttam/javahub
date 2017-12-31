package com.corejava.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {

	public static void main(String[] args) {
		Map<Integer,String> m1=new ConcurrentSkipListMap<Integer,String>();
		m1.put(1, "A");
		m1.put(2, "B");
		m1.put(3, "C");
		
		Set<Integer> s1=m1.keySet();
		Iterator<Integer> itr1=s1.iterator();
		while(itr1.hasNext())
		{
			m1.put(4, "D");
			System.out.println(itr1.next());
		}
		
		System.out.println("After inserting key");
		m1.keySet().forEach(s->System.out.println(s+" "+m1.get(s)));
		
		System.out.println("Iterating thorugh EntrySet");
		m1.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
		System.out.println("Iterating with Values");
		m1.values().forEach(s->System.out.println(s));
	}

}
