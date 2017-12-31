package com.corejava.hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeIntegerExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Vir");
		map.put(2, "ravi");
		map.put(3, "neha");
		map.put(4, "Rohit");
		
		System.out.println(map.get(1));
		
		map.put(1,"Over");
		System.out.println(map.get(1));
	}

}
