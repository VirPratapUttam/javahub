package com.interview.java8.practice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ForEachExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Vir");
		map.put(2, "Rajesh");
		map.put(3, "sachin");
		map.put(4, "Laddu");
		map.put(8, "Vir");
		map.put(7, "Rajesh");
		map.put(6, "sachin");
		map.put(5, "Laddu");
		
		

		System.out.println("--------Old Version-----------");
		//Old Way
		for(Map.Entry<Integer, String> entry:map.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		
		System.out.println("--------New Version-----------");
		//New Version
		map.forEach((k,v)->System.out.println(k+" "+v));
		
		System.out.println("--------New Version with Statements-----------");
		//Java 8 with Expression
		map.forEach((k,v)->{
			System.out.println(k+" "+v);
			if(k==3)
				System.out.println("K is 3");
		});
		
		System.out.println("Map.sort");
		Map<Integer,String> result=map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->newValue,LinkedHashMap::new));
		result.forEach((k,v)->System.out.println(k+" "+v));
		
		System.out.println("Map.sort");
		Map<Integer,String> resultValue=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->newValue,LinkedHashMap::new));
		resultValue.forEach((k,v)->System.out.println(k+" "+v));
		
	}

}
