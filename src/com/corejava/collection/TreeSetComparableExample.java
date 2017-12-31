package com.corejava.collection;

import java.util.Set;
import java.util.TreeSet;

class Employee6 implements Comparable<Employee6>
{
 private Integer empId;
 private String name;
 
	@Override
	public int compareTo(Employee6 o) {
		return this.empId.compareTo(o.empId);
		//return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return empId+" "+name;
	}
	public Employee6(Integer empId,String name)
	{
		this.empId=empId;
		this.name=name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class TreeSetComparableExample {

	public static void main(String[] args) {
		Set<Employee6> s1=new TreeSet<>();
		s1.add(new Employee6(1,"Vir"));
		s1.add(new Employee6(5,"Raj"));
		s1.add(new Employee6(4,"Rohit"));
		s1.add(new Employee6(2,"Raj"));
		s1.add(new Employee6(3,"Rohit"));
		s1.add(new Employee6(1,"Vir"));
		
		s1.forEach(e->System.out.println(e.getEmpId()+" "+e.getName()));
	}

}
