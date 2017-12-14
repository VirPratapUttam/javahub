package com.algorithm.dp;

public class LCSLengthRecursive {

	public static void main(String[] args) {
		int[] x={1,2,3,2,4,1,2};
		int[] y={2,4,3,1,2,1};
		System.out.println(lcsLength(x,0,x.length,y,0,y.length));
		String s1="ABCBDAB";
		String s2="BDCABA";
		System.out.println(lcsLength(s1.toCharArray(),0,s1.length(),s2.toCharArray(),0,s2.length()));
		
	}
	static int lcsLength(int[] x,int i,int m,int[] y,int j,int n)
	{
		if(i==m || j==n)
			return 0;
		else if(x[i]==y[j])
			return 1+lcsLength(x, i+1, m, y,j+1,n);
		else
			return Math.max(lcsLength(x, i+1, m, y,j,n), lcsLength(x, i, m, y,j+1,n));
	}
	
	static int lcsLength(char[] x,int i,int m,char[] y,int j,int n)
	{
		if(i==m || j==n)
			return 0;
		else if(x[i]==y[j])
			return 1+lcsLength(x, i+1, m, y,j+1,n);
		else
			return Math.max(lcsLength(x, i+1, m, y,j,n), lcsLength(x, i, m, y,j+1,n));
	}

}
