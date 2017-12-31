package com.interview.java8.practice2;

import java.util.ArrayList;
import java.util.List;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<String>();
		l1.add("Vir");
		l1.add("Raj");
		l1.add("Suresh");
		l1.add("Neha");
		
		System.out.println("First Version");
		l1.forEach(s->System.out.println(s));
		System.out.println("Second Version");
		l1.forEach(System.out::println);
		System.out.println("Third Versionn");
		l1.forEach((String s)->System.out.println(s));
		
		System.out.println("Stream & Lambda Expression");
		l1.stream().filter(s->s.contains("a")).forEach(System.out::println);
	}

}
