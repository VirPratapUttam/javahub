package com.interview.java8;
interface Messageable
{
	Message getMessage(String str);
}
class Message
{
	Message(String msg)
	{
		System.out.println("this is counstructor");
	}
}
interface Sayable
{
	void say();
}
public class MethodReferenceExample {

	public static void threadStatus()
	{
		System.out.println("Running");
	}
	public void method1()
	{
		System.out.println("Method1");
	}
	public static void display()
	{
		System.out.println("Inside Display");
	}
	public static void main(String[] args) {
		Sayable sayable=MethodReferenceExample::display;
		sayable.say();
		
		Thread t1=new Thread(MethodReferenceExample::threadStatus);
		t1.start();
		
		MethodReferenceExample m1=new MethodReferenceExample();
		Sayable s=m1::method1;
		s.say();
		Sayable s1=new MethodReferenceExample()::method1;
		s1.say();
		
		Messageable m2=Message::new;
		m2.getMessage("v");
	}

}
