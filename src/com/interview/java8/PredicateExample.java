package com.interview.java8;

import java.util.function.Predicate;

public class PredicateExample {

	private static boolean checkAge(int age)
	{
		if(age>17)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Predicate<Integer> pr=a->(a>18);
		System.out.println(pr.test(10));
		System.out.println(pr.test(20));
		Predicate<Integer> pr1=PredicateExample::checkAge;
		System.out.println(pr1.test(25));
		
	}

}
