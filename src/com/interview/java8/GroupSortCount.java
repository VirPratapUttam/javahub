package com.interview.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupSortCount {

	public static void main(String[] args) {

		List<String> fruits=Arrays.asList("apple","orange","mango","apple","orange","apple","mange");
		Map<String,Long> result=fruits.stream().collect(
				Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result);
		
		 Map<String, Long> finalMap = new LinkedHashMap<>();
		result.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		System.out.println(finalMap);
		
		System.out.println("Grouping");
		List<Employee> e=Arrays.asList(new Employee(1,"Vir",1000),
				new Employee(2,"raj",2000),
				new Employee(3,"rohit",1000));
		Map<Integer,List<String>> gp=e.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(gp);
		
		System.out.println("Grouping By Salary");
		Map<Integer,List<Employee>> gp1=e.stream().collect(Collectors.groupingBy(Employee::getSalary));
		System.out.println(gp1);
	}

}
