package com.corejava.simple.string;

final class ImmutableClass {
	final String data;

	public ImmutableClass(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}
}

class Employee {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "id "+id+" name "+name+" age "+age;
	}
	
}

public class ImmutableClassExample {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Vir",20);
		Employee e2=new Employee(2,"Rajesh",30);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}

}
