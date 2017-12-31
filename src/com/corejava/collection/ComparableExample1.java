package com.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee4 implements Comparable<Employee4>{
	private int empId;
	private String name;
	private String salary;
	private Integer badgeid;

	public Integer getBadgeid() {
		return badgeid;
	}

	public void setBadgeid(Integer badgeid) {
		this.badgeid = badgeid;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee4 o) {
		// TODO Auto-generated method stub
		//return this.name.compareTo(o.getName());
		//Descreasing
		//return o.getName().compareTo(this.name);
		//return this.getEmpId()-o.getEmpId();
		//return o.getEmpId()-this.getEmpId();
		return this.getBadgeid().compareTo(o.getBadgeid());
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Employee4(int empid,String name,String salary,Integer badgeid)
	{
		this.empId=empid;
		this.name=name;
		this.salary=salary;
		this.badgeid=badgeid;
	}
	
}

public class ComparableExample1
{

	public static void main(String[] args) {
		List<Employee4> l1=new ArrayList<>();
		l1.add(new Employee4(1,"Vir","10000",5));
		l1.add(new Employee4(4,"Raj","20000",3));
		l1.add(new Employee4(3,"Neha","15000",8));
		l1.add(new Employee4(2,"Moti","1000",1));
		
		System.out.println("Elements after sorting");
		Collections.sort(l1);
		l1.forEach(e->System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getSalary()+" "+e.getBadgeid()));
	}

}
