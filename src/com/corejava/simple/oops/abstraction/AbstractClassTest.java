package com.corejava.simple.oops.abstraction;

//Rule: If there is any abstract method in a class, that class must be abstract.
//Rule: If you are extending any abstract class that have abstract method, you must either provide the implementation of the method or make this class abstract.

abstract class Bank
{
	public abstract int rateofInterest();
}
class SBI extends Bank
{

	@Override
	public int rateofInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
}
class PNB extends Bank
{

	@Override
	public int rateofInterest() {
		// TODO Auto-generated method stub
		return 4;
	}
}

abstract class Shape
{
	public abstract void draw();
}
class Reactangle extends Shape
{

	@Override
	public void draw() {
		System.out.println("Rectangle");
		
	}
}
class Circle extends Shape
{

	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}

//An abstract class can have data member, abstract method, method body, constructor and even main() method.
abstract class Bike
{
	int x=10;
	public Bike()
	{
		System.out.println("Inside constructor :"+x);
	}
	abstract void run();
	public void display()
	{
		System.out.println("Inside the abstract bike class");
	}
}
class Honda extends Bike
{

	@Override
	void run() {
		System.out.println("Inside Honda");
	}
	
}
public class AbstractClassTest {

	public static void main(String[] args) {
		System.out.println("Bank Impl");
		Bank b=new SBI();
		System.out.println(b.rateofInterest());
		
		System.out.println("Shape Impl");
		Shape s=new Reactangle();
		s.draw();
		
		System.out.println("Bike Impl");
		Bike bike=new Honda();
		bike.run();
	}
}
