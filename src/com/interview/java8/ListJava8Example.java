package com.interview.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListJava8Example {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.addAll(Arrays.asList("Vir","A","B","E","C"));
		
		l1.forEach(s->{
			System.out.println(s);
			l1.add("Rohit");
		});
		
	}

}
