package com.corejava.simple.oops.polymorphism;

/*
 Usage of java super Keyword

super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.
 */
class Animal
{
	Animal()
	{
		System.out.println("Animla contructor");
	}
	String color="red";
	public void display()
	{
		System.out.println("Parent Display");
	}
}
class FourLegAnimal extends Animal
{
	public FourLegAnimal() {
		super();
		System.out.println("Four Leg Contructor");
	}
	String color="blue";
}
class Dog extends FourLegAnimal
{
	public Dog() {
		// super is used to invoke parent class constructor.
		//Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
		super();
		System.out.println("Dog contructor");
	}
	String color="white";
	public void printColor()
	{
		System.out.println("Dog Color : "+color);
		System.out.println("Animal Color :"+super.color);
		display();
		//super can be used to invoke parent class method
		super.display();
	}
	public void display()
	{
		System.out.println("Child Display");
	}
}
public class SuperTest {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.printColor();
		
	}

}
