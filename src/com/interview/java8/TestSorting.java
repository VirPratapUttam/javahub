package com.interview.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*class Employee {
	private int age;
	private String name;
	private int salary;

	public Employee(int age, String name, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}*/

public class TestSorting {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp = getEmployee();

		System.out.println("Before Sorting");
		for (Employee e : emp) {
			System.out.println(e.getAge() + " " + e.getName() + " " + e.getSalary());
		}

		Collections.sort(emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.getAge() == e2.getAge()) {
					if (e1.getName().compareTo(e2.getName()) == 0) {
						return e1.getSalary()-e2.getSalary();
					}
					else
					{
						return e1.getName().compareTo(e2.getName());
					}
				} else {
					return e1.getAge() - e2.getAge();
				}
			}
		});

		/*
		 * Collections.sort(emp, new Comparator<Employee>(){
		 * 
		 * @Override public int compare(Employee arg0, Employee arg1) { // TODO
		 * Auto-generated method stub return arg0.getAge()-arg1.getAge(); }
		 * 
		 * });
		 * 
		 * Collections.sort(emp,new Comparator<Employee>(){
		 * 
		 * @Override public int compare(Employee emp1,Employee emp2) { return
		 * emp1.getName().compareTo(emp2.getName()); } });
		 * Collections.sort(emp,new Comparator<Employee>(){
		 * 
		 * @Override public int compare(Employee emp1,Employee emp2) { return
		 * emp1.getSalary()-emp2.getSalary(); } });
		 */
		System.out.println("After Sorting");
		for (Employee e : emp) {
			System.out.println(e.getAge() + " " + e.getName() + " " + e.getSalary());
		}
	}

	private static List<Employee> getEmployee() {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(20, "Vir", 1000));
		emp.add(new Employee(20, "Mona", 2000));
		emp.add(new Employee(20, "Mona", 4000));
		emp.add(new Employee(20, "Mona", 1000));
		emp.add(new Employee(10, "Laddu", 3000));
		emp.add(new Employee(50, "Mudit", 4000));
		return emp;
	}

}
