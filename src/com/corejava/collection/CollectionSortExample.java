package com.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		Collections.addAll(l1,1,2,3,4);
		System.out.println("Initial List");
		l1.forEach(System.out::println);
		
		Collections.sort(l1);
		System.out.println("After Sorting");
		l1.forEach(System.out::println);
		
		
	}

}
