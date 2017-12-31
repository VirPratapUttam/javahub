package com.interview.java8.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Developer {
	private String name;
	private Integer age;
	private Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Developer(String name, Integer age, Integer salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}
}

public class TestSorting {

	public static void main(String[] args) {
		List<Developer> list=new ArrayList<>();
		list=getDevelopers();
		
		System.out.println("Before Sorting");
		list.forEach(d->System.out.println(d.getName()+" "+d.getAge()+" "+d.getSalary()));
		
		Collections.sort(list,new Comparator<Developer>()
				{
					@Override
					public int compare(Developer d1, Developer d2) {
						/*if(d1.getAge()==d2.getAge())
							return 0;
						else if (d1.getAge()>d2.getAge())
							return 1;
						else
							return -1;*/
						return d1.getAge()-d2.getAge();
					}
				});
		
		System.out.println("After Sorting");
		list.forEach(d->System.out.println(d.getName()+" "+d.getAge()+" "+d.getSalary()));
		
		System.out.println("------------New Before Sorting-------------");
		List<Developer> l2=new ArrayList<>();
		l2=getDevelopers();
		l2.forEach(d->System.out.println(d.getName()+" "+d.getAge()+" "+d.getSalary()));
		
		l2.sort(new Comparator<Developer>(){
			@Override
			public int compare(Developer d1,Developer d2)
			{
				return d1.getAge()- d2.getAge();
			}
		});
		
		l2.sort(new Comparator<Developer>(){
			@Override
			public int compare(Developer d1,Developer d2)
			{
				return d1.getName().compareTo(d2.getName());
			}
		});
		
		System.out.println("---After Java 8 Sorting-------");
		l2.forEach(d->System.out.println(d.getName()+" "+d.getAge()+" "+d.getSalary()));
		
		//Lambda Expression Example Age Sorting
		l2.sort((Developer d1,Developer d2)->d1.getAge()-d2.getAge());
		
		System.out.println("----After Lambda Expression Age Sorting-----");
		l2.forEach(d->System.out.println(d.getName()+" "+d.getAge()+" "+d.getSalary()));
		
		//Lambda Expression Name sorting
		System.out.println("----After Lambda Expression Name Sorting-----");
		l2.sort((Developer d1,Developer d2)->d1.getName().compareTo(d2.getName()));
		l2.forEach(d->System.out.println(d.getName()+" "+d.getAge()+" "+d.getSalary()));
		
		System.out.println("----After Lambda Expression Salary Sorting-----");
		l2.sort((d1,d2)->d1.getSalary()-d2.getSalary());
		l2.forEach(d->System.out.println(d.getName()+" "+d.getAge()+" "+d.getSalary()));
		
		System.out.println("----After Lambda Expression Name Sorting Reverse Order-----");
		Comparator<Developer> salaryComparator=(d1,d2)->d1.getName().compareTo(d2.getName());
		l2.sort(salaryComparator.reversed());
		l2.forEach(d->System.out.println(d.getName()+" "+d.getAge()+" "+d.getSalary()));
		
		System.out.println("----After Lambda Expression Salary Sorting Reverse Order-----");
		l2.sort((d1,d2)->d2.getSalary()-d1.getSalary());
		l2.forEach(d->System.out.println(d.getName()+" "+d.getAge()+" "+d.getSalary()));
		
	}

	public static List<Developer> getDevelopers()
	{
		List<Developer> developers=new ArrayList<>();
		Collections.addAll(developers,new Developer("Vir",34,1000),new Developer("Ravi",35,2000),new Developer("Aashu",36,1000),new Developer("Nitin",34,2000));
		return developers;
	}
}
