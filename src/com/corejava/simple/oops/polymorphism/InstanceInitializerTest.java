package com.corejava.simple.oops.polymorphism;
/*
 The java compiler copies the instance initializer block in the constructor after the first statement super().
  So firstly, constructor is invoked.
 */
class Vehicle
{
	public Vehicle()
	{
		System.out.println("Vehicle Contructor");
	}
}
class Bike extends Vehicle{
	int speed;

	{
		speed = 100;
		speed+=50;
		System.out.println("Instance Initializer Block 1");
	}
	{
		System.out.println("Instance Initializer block 2");
	}
	{
		System.out.println("Instance Initialize block 3");
	}
	Bike()
	{
		System.out.println("Contructor is invoked");
		System.out.println("Speed is :-"+speed);
	}
}

public class InstanceInitializerTest {

	public static void main(String[] args) {
		Bike b=new Bike();
	}

}
