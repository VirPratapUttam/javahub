package com.corejava.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparator {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer,String>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
			
		});
		map.put(3, "Vir");
		map.put(2, "Rajesh");
		map.put(1, "Rohit");
		map.put(4, "Neha");
		
		map.entrySet().forEach((entry)->System.out.println("Key is: "+entry.getKey()+" Value is :-"+entry.getValue()));
		
		
		/*System.out.println("After Implementing Java 8 Version");
		Map<Integer,String> map=new TreeMap()*/
		
		
	}

}
