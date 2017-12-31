package com.corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
	private int rollno;
	private String name;
	private int marks;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int rollNo, String name, int marks) {
		this.rollno = rollNo;
		this.name = name;
		this.marks = marks;
	}
}

public class ArrayListExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Vir", 100));
		studentList.add(new Student(2, "Laddu", 200));
		studentList.add(new Student(3, "Ravi", 300));

		for (Student s : studentList) {
			System.out.println(s.getRollno() + " " + s.getName() + " " + s.getMarks());
		}
		//Java 8
		System.out.println("Java 8");
		studentList.forEach(s->System.out.println(s.getRollno()+" "+s.getName()+" "+s.getMarks()));

		//through iterator
		Iterator itr=studentList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
