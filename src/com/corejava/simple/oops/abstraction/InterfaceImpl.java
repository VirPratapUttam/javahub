package com.corejava.simple.oops.abstraction;

//Since Java 8, interface can have default and static methods which is discussed later.
//The java compiler adds public and abstract keywords before the interface method. 
//More, it adds public, static and final keywords before data members.
interface Printable
{
	
	public void print();
	public abstract void display();
	public static final int MAX_VALUE=10;
	int MIN_VALUE=1;
	default void msg()
	{
		System.out.println("Java 8 Defualt Message");
	}
	static void sumAndPrint(int x)
	{
		x+=10;
		System.out.println("X is :"+x);
	}
}
class Print implements Printable
{

	@Override
	public void print() {
		System.out.println("Print");
	}

	@Override
	public void display() {
		System.out.println("Display");
	}
}
public class InterfaceImpl {

	public static void main(String[] args) {
		Print p=new Print();
		p.display();
		p.print();
		System.out.println(p.MIN_VALUE);
		System.out.println(p.MAX_VALUE);
		p.msg();
		Printable.sumAndPrint(10);
	}

}
