package com.interview.java8;

import java.util.ArrayList;
import java.util.List;

class Employee4
{
	private Integer empid;
	private String name;
	private String Address;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Employee4(Integer empid,String name,String address)
	{
		this.empid=empid;
		this.name=name;
		this.Address=address;
	}
}
public class Java8ComparatorExample {

	public static void main(String[] args) {
		List<Employee4> l1=new ArrayList<>();
		l1.add(new Employee4(1,"Vir","Jabalpur"));
		l1.add(new Employee4(4,"Ravi","Pune"));
		l1.add(new Employee4(3,"Nitin","Blr"));
		l1.add(new Employee4(2,"Rohit","Pune"));
		l1.add(new Employee4(5,"Angel","Noida"));
		
		System.out.println("Sorting Empid Asc");
		l1.sort((e1,e2)->e1.getEmpid().compareTo(e2.getEmpid()));
		l1.forEach(e->System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getAddress()));
		
		System.out.println("Sorting EmpName Asc");
		l1.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		l1.forEach(e->System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getAddress()));
		
		System.out.println("Sorting Address Asc");
		l1.sort((e1,e2)->e1.getAddress().compareTo(e2.getAddress()));
		l1.forEach(e->System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getAddress()));
		
		
		System.out.println("Sorting Empid Desc");
		l1.sort((e1,e2)->e2.getEmpid().compareTo(e1.getEmpid()));
		l1.forEach(e->System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getAddress()));
		
		System.out.println("Sorting EmpName Asc");
		l1.sort((e1,e2)->e2.getName().compareTo(e1.getName()));
		l1.forEach(e->System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getAddress()));
		
		System.out.println("Sorting Address Asc");
		l1.sort((e1,e2)->e2.getAddress().compareTo(e1.getAddress()));
		l1.forEach(e->System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getAddress()));
	}

}
