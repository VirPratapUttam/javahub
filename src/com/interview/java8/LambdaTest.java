package com.interview.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Vir");
		names.add("Laddu");
		names.add("Mona");
		names.add("Angel");
		LambdaTest lt = new LambdaTest();
		lt.sortNamesUsingJava7(names);
		
		names.stream().filter(s->s.contains("Vir")).forEach(System.out::println);

		names.forEach(k -> System.out.println(k));

		List<String> names1 = new ArrayList<>();
		names1.add("Vir");
		names1.add("Raj");
		names1.add("Mona");
		names1.add("Mudit");
		
		System.out.println("Print the names");
		names1.forEach(System.out::println);
		
		LambdaTest lt1 = new LambdaTest();
		lt1.sortUsingJava8(names1);

		names1.forEach(name -> System.out.println(name));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Vir");
		map.put(2, "Raju");
		map.put(3, "Anoop");

		map.forEach((k, v) -> System.out.println("Key is:- " + k + "Value :- " + v));
		
		map.forEach((k,v)->{
			System.out.println("Key is :-"+k);
			if(k==1)
				System.out.println("Key is One");
			else
				System.out.println("Key is not one");
		});
		
		
	}

	private void sortNamesUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

}
