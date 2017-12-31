package com.corejava.enumpractice;

enum Bear
{
	FC,RC,FO;
}

interface Test
{
	enum Days
	{
		Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
	}
}
public class EnumImpl {
	enum Month
	{
		Jan,Feb,Mar,Apr,May,June,July,Aug,Sept,Oct,Nov,Dec
	}

	public static void main(String[] args) {
		Bear b=Bear.FC;
		System.out.println(b);
		System.out.println(Month.Jan);
		System.out.println(Test.Days.Monday);
		Test.Days days=Test.Days.Monday;
		
		for(Month m:Month.values())
		{
			System.out.println(m+"........."+m.ordinal());
		}
		switch(days)
		{
		case Monday:
			System.out.println("Monday");
			break;
		//Test cannot be resolved or is not a field
		/*case Test:
			System.out.println("");*/
		default:
			System.out.println("Rest");
			break;
		}
		
		//The member enum Month can only be defined inside a top-level class or interface or in a static context
		/*enum Month
		{
			Jan,Feb;
		}*/
	}

}
