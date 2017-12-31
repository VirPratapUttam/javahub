package com.interview.java8;
@FunctionalInterface
interface AA
{
	void display();
}
interface BB extends AA
{
	@Override
	void display();
}
/*@FunctionalInterface
interface FCTest
{
	void apply();
	// only one abstract method is apply
	//void diplay();
}*/

public class FucntionalInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=()->System.out.println("A");
		BB b=()->System.out.println("B");
		a.display();
		b.display();

	}

}
