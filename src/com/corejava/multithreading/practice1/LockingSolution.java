package com.corejava.multithreading.practice1;

class Employee {
	private Integer empid;
	private String name;

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

	public Employee(Integer empid,String name)
	{
		this.empid=empid;
		this.name=name;
	}
	public Employee()
	{
		
	}
}

class MyRunnable9 implements Runnable
{

	@Override
	public void run() {
		Employee e1=new Employee(1,"Vir");
		synchronized (e1) {
			System.out.println("Whole Class Example");
		}
		synchronized (e1.getName()) {
			System.out.println("Individual Member Variable Lock");
		}
	}
}

public class LockingSolution {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyRunnable9(),"Thread 1");
		t1.start();
	}

}
