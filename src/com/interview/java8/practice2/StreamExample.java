package com.interview.java8.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class StreamExample {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("Vir", "Raj", "Mona", "Rohit");
		System.out.println("Old Approach");
		l1 = getFilteredList(l1);

		l1.forEach(System.out::println);

		List<String> l2 = Arrays.asList("Vir", "Raj", "Mona", "Rohit");
		System.out.println("New Approach");
		List<String> result = l2.stream().filter(p -> !"Mona".equalsIgnoreCase(p)).collect(Collectors.toList());
		result.forEach(System.out::println);
	}

	private static List<String> getFilteredList(List<String> l1) {
		List<String> list1 = new ArrayList<>();
		for (String s : l1) {
			if (!"Raj".equalsIgnoreCase(s)) {
				list1.add(s);
			}
		}
		return list1;
	}

}
