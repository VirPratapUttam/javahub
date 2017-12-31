package com.corejava.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class CustomHashSet<E>
{
	private HashMap<E,Object> hashMap;
	public CustomHashSet()
	{
		hashMap=new HashMap<>();
	}
	public void add(E value)
	{
		hashMap.put(value, null);
	}
	public boolean contains(E obj)
	{
		return hashMap.containsKey(obj)?true:false;
	}
	public Set<E> get()
	{
		return hashMap.keySet();
	}
}

public class CustomHashSetExample {

	public static void main(String[] args) {
		CustomHashSet<Integer> hs=new CustomHashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		Set<Integer> s=hs.get();
		s.forEach(System.out::println);
	}

}
