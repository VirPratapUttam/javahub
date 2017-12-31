package com.interview.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8MapSorting {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(3, "Vir");
		map.put(4,"Rajesh");
		map.put(5, "Tony");
		map.put(1, "Rohan");
		map.put(2, "Rohit");
		
		System.out.println("Sort By Key");
		Map<Integer, String> result1 =map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		result1.entrySet().forEach((e)->System.out.println(e.getKey()+" "+e.getValue()));
		
		System.out.println("Sort By Value");
		Map<Integer, String> result2 =map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		result2.entrySet().forEach((e)->System.out.println(e.getKey()+" "+e.getValue()));
		
		System.out.println("Sort by Key with foreachOrdered");
		Map<Integer, String> result3 = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x->result3.put(x.getKey(), x.getValue()));
		result3.entrySet().forEach((e)->System.out.println(e.getKey()+" "+e.getValue()));
	}

}
