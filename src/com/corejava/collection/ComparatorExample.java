package com.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
	private Integer rollNo;
	private String name;
	private Integer marks;
	
	public Student2(Integer rollNo, String name, Integer marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

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

}
class RollNoComparator implements Comparator<Student2>
{

	@Override
	public int compare(Student2 s1, Student2 s2) {
		if(s1.getRollNo()==s2.getRollNo())
			return 0;
		else if(s1.getRollNo()>s2.getRollNo())
			return 1;
		else 
			return -1;
	}
}
class NameComparator implements Comparator<Student2>
{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class MarksComparator implements Comparator<Student2>
{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		if(o1.getMarks()==o2.getMarks())
			return 0;
		else if(o1.getMarks()>o2.getMarks())
			return 1;
		else
			return -1;
	}
}
class RollNoAndNameComparator implements Comparator<Student2>
{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		if(o1.getRollNo()==o2.getRollNo())
			return o1.getName().compareTo(o2.getName());
		else if(o1.getRollNo()>o2.getRollNo())
			return 1;
		else
			return -1;
	}
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student2> l1=new ArrayList<>();
		Collections.addAll(l1, new Student2(4,"Vir",100),new Student2(2,"Raj",50),new Student2(5,"Rohit",150),new Student2(2,"Aaj",10));
		System.out.println("Before Sorting");
		l1.forEach(s->System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getMarks()));
		System.out.println("After sorting:RollNo");
		Collections.sort(l1,new RollNoComparator());
		l1.forEach(s->System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getMarks()));
		
		System.out.println("After sorting:Name");
		Collections.sort(l1,new NameComparator());
		l1.forEach(s->System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getMarks()));
		
		System.out.println("After Sorring:Marks");
		Collections.sort(l1,new MarksComparator());
		l1.forEach(s->System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getMarks()));
		
		System.out.println("After RollNumber and Name Comparator");
		Collections.sort(l1,new RollNoAndNameComparator());
		l1.forEach(s->System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getMarks()));
	}

}
