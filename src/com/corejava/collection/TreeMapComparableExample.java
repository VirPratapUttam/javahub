package com.corejava.collection;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

class Employee5 implements Comparable<Employee5>
{

	private Integer empid;
	private String name;
	
	public Employee5(Integer empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee5 o) {
	//	return this.getEmpid().compareTo(o.getEmpid());
	//	return this.getName().compareTo(o.getName());
		return o.getName().compareTo(this.getName());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empid.toString()+" "+name;
	}
	
	
	
}
public class TreeMapComparableExample {

	public static void main(String[] args) {
		Map<Employee5,Integer> map=new TreeMap<Employee5,Integer>();
		map.put(new Employee5(4,"Vir"), 1);
		map.put(new Employee5(2,"Raj"), 2);
		map.put(new Employee5(1, "Rohit"),3);
		map.put(new Employee5(3,"Abb"), 4);
		
		System.out.println("Map After Sorting");
		map.entrySet().forEach(e->System.out.println(e.getKey().toString()));
	}

}
