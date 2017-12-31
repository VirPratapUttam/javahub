package com.corejava.collection;

import java.util.EnumSet;
import java.util.Set;

enum Days
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,SATURDAY
}
public class EnumSetExample {

	public static void main(String[] args) {
		Set<Days> s=EnumSet.of(Days.SATURDAY,Days.SUNDAY);
		s.forEach(d->System.out.println(d));
		Set<Days> s1=EnumSet.allOf(Days.class);
		System.out.println("All of ");
		s1.forEach(System.out::println);
		Set<Days> s2=EnumSet.noneOf(Days.class);
		System.out.println("None of");
		s2.forEach(System.out::println);
	}

}
