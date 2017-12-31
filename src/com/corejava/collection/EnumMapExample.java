package com.corejava.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {

	public static void main(String[] args) {
		Map<Days,Integer> map=new EnumMap<Days,Integer>(Days.class);
		map.put(Days.MONDAY, 1);
		map.put(Days.SATURDAY, 2);
		map.put(Days.WEDNESDAY, 3);
		
		map.entrySet().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
	}

}
