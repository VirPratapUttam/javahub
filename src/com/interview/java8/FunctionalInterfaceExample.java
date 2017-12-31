package com.interview.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfaceExample {

	public static String getMessage(String s)
	{
		return "Hello "+s;
	}
	static Integer addList(List<Integer> list){  
        return list.stream()  
                   .mapToInt(Integer::intValue)  
                   .sum();  
    }  
	public static void main(String[] args) {
		Function<String,String> f1=FunctionalInterfaceExample::getMessage;
		String result=f1.apply("Vir");
		System.out.println(result);
		List<Integer> l1=Arrays.asList(10,20,30,40);
		Function<List,Integer> f2=FunctionalInterfaceExample::addList;
		System.out.println(f2.apply(l1));
	}

}
