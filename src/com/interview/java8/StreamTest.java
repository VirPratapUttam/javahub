package com.interview.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee1 {
	private Integer empid;
	private String name;
	private Integer salary;

	public Employee1(Integer empid, String name, Integer salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}

public class StreamTest {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("a", "b", "c", "d");

		System.out.println("Before Java 8");
		List<String> alphaUpper = new ArrayList<>();
		for (String s : str) {
			alphaUpper.add(s.toUpperCase());
		}
		System.out.println(alphaUpper);

		System.out.println("After Java 8");
		List<String> upper = str.stream().map(String::toUpperCase).collect(Collectors.toList());
		upper.forEach(System.out::println);

		List<Integer> num = Arrays.asList(1, 2, 3, 5);
		List<Integer> doubleNum = num.stream().map(n -> n * 2).collect(Collectors.toList());
		doubleNum.forEach(System.out::println);
		
		System.out.println("Convert object to String");
		List<Employee1> emp=Arrays.asList(new Employee1(1,"Vir",1000),
											new Employee1(2,"Raj",2000));
		
		List<String> result=emp.stream().map(Employee1::getName).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		System.out.println("Convert object to object");
		List<Employee> objectResult=emp.stream().map(temp->
		{
			Employee e=new Employee(temp.getEmpid(),temp.getName(),temp.getSalary());
			return e;
		}).collect(Collectors.toList());
		objectResult.forEach(obj->System.out.println(obj.getName()));
	}

}
