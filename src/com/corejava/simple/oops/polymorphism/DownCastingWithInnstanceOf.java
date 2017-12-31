package com.corejava.simple.oops.polymorphism;

class Bird
{
	public void voice()
	{
		System.out.println("Bird Voice");
	}
}
class Parrot extends Bird
{
	public void voice()
	{
		System.out.println("Parrot Voice");
	}
}
class Peacock extends Bird
{
	public void voice()
	{
		System.out.println("Peacock Voice");
	}
	public static void method1(Bird b)
	{
		if(b instanceof Peacock)
		{
			Peacock p=(Peacock)b;
			System.out.println("Downcastin successful");
		}
	}
}
public class DownCastingWithInnstanceOf {

	public static void main(String[] args) {
		Peacock p=new Peacock();
		System.out.println(p instanceof Bird);
		System.out.println(p instanceof Peacock);
		Peacock p2=null;
		System.out.println(p2 instanceof Bird);
		
		//Peacock p3=(Peacock) new Bird();
		//Below code will through java.lang.ClassCastException: 
		//p3.voice();
		Bird p4=new Peacock();
		Peacock.method1(p4);
	//	System.out.println(p instanceof Animal);
	}

}
