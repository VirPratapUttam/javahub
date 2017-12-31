package com.corejava.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "vir");
		hashMap.put(2, "Raju");
		hashMap.put(3, "Twinkle");
		hashMap.put(4, "Laddu");

		for (Map.Entry<Integer, String> e : hashMap.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println("Java 8");
		hashMap.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		System.out.println("Iterator");
		/*Set<Integer> s= hashMap.entrySet();
		Iterator itr=s.iterator();
				
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> e=(Map.Entry<Integer, String>)itr.next();
			System.out.println(e.getValue()+" "+e.getValue());
		}*/
	}

}
