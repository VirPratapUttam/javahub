package com.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println("Initial List");
		l1.forEach(System.out::println);
		
		Collections.addAll(l1, 4,5);
		System.out.println("After Adding");
		l1.forEach(System.out::println);

	}

}
