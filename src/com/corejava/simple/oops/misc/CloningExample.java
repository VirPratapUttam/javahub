package com.corejava.simple.oops.misc;
class Student implements Cloneable
{
	private int rollNo;
	private int age;
	public Student(int rollNo,int age)
	{
		this.rollNo=rollNo;
		this.age=age;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class CloningExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(1,20);
		Student s2=(Student) s1.clone();
		
		System.out.println(s1.getRollNo()+"---"+s1.getAge());
		System.out.println(s2.getRollNo()+"---"+s2.getAge());
	}

}
