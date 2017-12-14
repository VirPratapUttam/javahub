package com.algorithm.dp;

public class Factorial {
	static int[] facto=new int[5];

	public static void main(String[] args) {
		System.out.println(fact(4));
		System.out.println(fact(0));
		System.out.println(fact(1));
		System.out.println(fact(3));
	}
	public static int fact(int n)
	{
		if(n==0 || n==1)
			return 1;
		else if(facto[n]!=0)
			return facto[n];
		else
			return facto[n]=n*fact(n-1);
	}
}
