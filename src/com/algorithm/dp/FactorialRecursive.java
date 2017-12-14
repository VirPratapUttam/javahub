package com.algorithm.dp;

public class FactorialRecursive {

	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(fact(0));
		System.out.println(fact(1));
		System.out.println(fact(3));
	}
	public static int fact(int n)
	{
		if(n==0 || n==1)
			return 1;
		else 
			return n*fact(n-1);
	}

}
