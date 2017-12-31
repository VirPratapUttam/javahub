package com.corejava.simple;

import datastructure.stack.StackSorter;

class Employee
{
   	public int age;
	public String name;
	public static Integer salary;
}
class VariableExample
{
	public static void main(String[] args) {
		
		// Instance Variable Check
		Employee e1=new Employee();
		e1.age=10;
		Employee e2=new Employee();
		e2.age=20;
		System.out.println("E1:Age :"+e1.age);
		System.out.println("E2.Age :"+e2.age);
		
		// Static Variable Check
		
		Employee e3=new Employee();
		Employee e4=new Employee();
		e3.salary=3000;
		e4.salary=4000;
		System.out.println("E3:salary :"+e3.salary);
		System.out.println("E4:salary :"+e4.salary);
		
		// no modifier in local variable
		int localVar=10;
		System.out.println(localVar);
		
		
	}
}