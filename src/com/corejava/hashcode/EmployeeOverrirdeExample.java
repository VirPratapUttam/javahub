package com.corejava.hashcode;

import java.util.HashMap;
import java.util.Map;

class Employee
{
	private Integer empId;
	private String name;
	public Employee(Integer empId,String name)
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
	@Override
	public int hashCode() {
		return this.empId==null?0:this.empId.hashCode()+this.name==null?0:this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		/*if(this.getClass()!=obj.getClass())
			return false;*/
		if(!(obj instanceof  Employee))
			return false;
		Employee e1=(Employee)obj;
		return (this.empId==e1.empId || this.empId.equals(e1.name) && this.name==e1.name || this.name.equals(e1.name));
	}
	@Override
	public String toString() {
		return this.empId+" "+this.name;
	}
}

class ChildEmployee extends Employee
{

	public ChildEmployee(Integer empId, String name) {
		super(empId, name);
	}
	
}
public class EmployeeOverrirdeExample {

	public static void main(String[] args) {
		Map<Employee,Integer> hm=new HashMap<Employee,Integer>();
		hm.put(new Employee(1,"Vir"), 1);
		hm.put(new Employee(2,"Rah"), 2);
		hm.put(new Employee(3,"Neha"), 3);
		
		
		System.out.println("Retrieve Value:-"+hm.get(new Employee(1,"Vir")));
		System.out.println("HashMap Data");
		hm.entrySet().forEach(e-> System.out.println(e.getKey().toString()+" "+e.getValue()));
		hm.put(new Employee(1,"Vir"), 4);
		
		hm.put(new ChildEmployee(1,"Vir"), 9);
		
		System.out.println("HashMap Data After Overriding");
		hm.entrySet().forEach(e-> System.out.println(e.getKey().toString()+" "+e.getValue()));
	}

}
