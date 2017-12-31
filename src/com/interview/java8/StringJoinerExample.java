package com.interview.java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",");
		sj.add("Vir");
		sj.add("Rohit");
		sj.add("Nilesh");
		String result=sj.toString();
		System.out.println(result);
		
		StringJoiner sj1=new StringJoiner("/","prefex-","-suffix-");
		sj1.add("Vir");
		sj1.add("Rohit");
		sj1.add("Mohit");
		System.out.println(sj1.toString());
		
		String result1=String.join(",", "2015","10","1");
		System.out.println(result1);
		
		List<String> l1=Arrays.asList("Vir","Mohit","mudit","sanjeev");
		System.out.println("String joiner :-"+String.join(",", l1));
		
		
	}

}
