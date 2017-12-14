package com.algorithm.dp;

public class Fabonacci {

	public static void main(String[] args) {
		fibonacci(5);
		fibonacci(3);
	}
	
	static void fibonacci(int n)
	{
		int a=0,b=1,sum,i;
		for(i=0;i<n;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}

}
