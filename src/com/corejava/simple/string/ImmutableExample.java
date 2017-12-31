package com.corejava.simple.string;

import java.util.HashMap;
import java.util.Map;

public class ImmutableExample {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		String s1="vir";
		hm.put(s1, 1);
		hm.put("Rajesh", 2);
		hm.put("Rohit", 3);
		s1.toUpperCase();
		System.out.println(hm.get("vir"));
		
		/*Map<StringBuilder,Integer> hm2=new HashMap<>();
		String s2="vir";
		hm2.put(s2, 1);
		hm2.put("Rajesh", 2);
		hm2.put("Rohit", 3);
		s2.toUpperCase();
		System.out.println(hm.get("vir"));*/
		
		
	}

}
