package com.algorithm.dp;

public class LCSPrint {

	public static void main(String[] args) {
		int[] x = { 3,9 ,8 ,3, 9, 7, 9, 7, 0 };
		int[] y = { 3, 3, 9, 9, 9, 1, 7, 2, 0, 6 };
		int m = x.length;
		int n = y.length;

		print(x, m, y, n);
		/*
		 * String s1="ABCBDAB"; String s2="BDCABA";
		 * System.out.println(lcsLength(s1.toCharArray(),0,s1.length(),s2.
		 * toCharArray(),0,s2.length()));
		 */

	}

	static void print(int[] x,int m,int[] y,int n)
	{
		int[][] LCSTable = new int[m+1][n+1];
		  
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    LCSTable[i][j] = 0;
                else if (x[i-1] == y[j-1])
                    LCSTable[i][j] = LCSTable[i-1][j-1] + 1;
                else
                    LCSTable[i][j] = Math.max(LCSTable[i-1][j], LCSTable[i][j-1]);
            }
        }
		 int index = LCSTable[m][n];
		int[] lcs=new int[index+1];
		int i=m;
		int j=n;
		while(i>0 && j>0)
		{
			if(x[i-1]==y[j-1])
			{
				lcs[index-1]=x[i-1];
				i--;
				j--;
				index--;
			}
			else if (LCSTable[i-1][j] > LCSTable[i][j-1])
                i--;
            else
                j--;
		}
        for(int k=0;k<LCSTable[m][n];k++)
            System.out.print(lcs[k]+" ");
	}
	
	

}
