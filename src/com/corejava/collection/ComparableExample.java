package com.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
	private Integer rollNo;
	private String name;
	private Integer marks;

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student1 s1) {
		// TODO Auto-generated method stub
		if(rollNo==s1.getRollNo())
			return 0;
		else if(rollNo>s1.getRollNo())
			return 1;
		else
			return -1;
	}
	public Student1(Integer rollNo,String name,Integer marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}

}

public class ComparableExample {

	public static void main(String[] args) {
		List<Student1> l1=new ArrayList<>();
		l1.add(new Student1(2,"Vir",100));
		l1.add(new Student1(4,"Raju",200));
		l1.add(new Student1(1,"Rohit",201));
		
		Collections.sort(l1);
		l1.forEach(s1->System.out.println(s1.getRollNo()+" "+s1.getName()+" "+s1.getMarks()));
		
	}

}
