package com.corejava.simple.oops.polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;
//Method is overridden not the datamembers, so runtime polymorphism can't be achieved by data members.
class Bank {
	public int getRateOfInterest() {
		return 5;
	}

	public static void getBankName() {
		System.out.println("Main Branch");
	}

	public final void display() {
		System.out.println("Display");
	}

	public void show() {
		System.out.println("Inside Show Bank");
	}
}

class SBI extends Bank {
	public int getRateOfInterest() {
		return 6;
	}

	public static void getBankName() {
		System.out.println("SBI");
	}
	/*
	 * protected void show() { System.out.println("inside show SBI"); }
	 */
	/*
	 * public final void display() { System.out.println("Display"); }
	 */
}

class PNB extends Bank {
	public int getRateOfInterest() {
		return 7;
	}
}

class Axis extends Bank {
	public int getRateOfInterest() {
		return 8;
	}
}

class Parent {
	public void msg() {
		System.out.println("Msg");
	}

	public void msg1() throws IOException {
		System.out.println("msg 1 : Parent");
	}

	public void msg2() throws IOException {
		System.out.println("msg2 : Parent");
	}

	public void msg3() throws IOException {
		System.out.println("msg3 : Parent");
	}
}

class ExceptionTest extends Parent {
	// Rule: If the superclass method does not declare an exception, subclass
	// overridden method cannot declare the checked exception.
	/*
	 * public void msg() throws IOException { System.out.println(
	 * "msg ExceptionTest"); }
	 */
	// Rule: If the superclass method does not declare an exception, subclass
	// overridden method cannot declare the checked exception but can declare
	// unchecked exception.
	public void msg() throws NullPointerException {
		System.out.println("msg Exception Test");
	}

	// Rule: If the superclass method declares an exception, subclass overridden
	// method can declare same, subclass exception or no exception but cannot
	// declare parent exception.
	public void msg1() throws IOException {
		System.out.println("msg1 : Exception");
	}

	public void msg2() throws NullPointerException {
		System.out.println("msg2 : Exceptiion");
	}

	/*
	 * public void msg3() throws Exception { System.out.println(
	 * "msg3 : Excetpion"); }
	 */
	public void msg3() throws FileNotFoundException {
		System.out.println("msg3 : Excetpion");
	}

}

class A {
	A get() {
		return this;
	}

}

class B1 extends A {
	B1 get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}
}

public class MethodOveridingTest {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println(b.getRateOfInterest());

		b = new SBI();
		System.out.println(b.getRateOfInterest());
		b.getBankName();

		SBI sbi = new SBI();
		sbi.getBankName();

		b = new PNB();
		System.out.println(b.getRateOfInterest());

		b = new Axis();
		System.out.println(b.getRateOfInterest());
		
		new B1().get().message();
	}

}
