package com.corejava.simple.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Employee {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class ClassLoaderExample {

	public static void main(String[] args) throws ClassNotFoundException {
	/*	Class c=Class.forName("Employee");
		Method[] m=c.getDeclaredMethods();
		System.out.println("Method name of Employee class");
		for(Method m1:m)
			System.out.println(m1.getName());
		
		System.out.println("Field Name of Employee class");
		Field[] f=c.getDeclaredFields();
		for(Field f1:f)
			System.out.println(f1.getName());*/
		
		
		Employee s1=new Employee();
		Class c1=s1.getClass();
		
		Employee s2=new Employee();
		Class c2=s2.getClass();
		
		System.out.println("C1:HashCode :"+c1.hashCode());
		System.out.println("C2:HashCode :"+c2.hashCode());
		System.out.println(c1==c2);
		
		System.out.println("Class Loader Details");
		System.out.println(String.class.getClassLoader());
		System.out.println(Employee.class.getClassLoader());
		
	}

}
