package com.algorithm.dp;

import java.util.Scanner;

public class CoinChange {
	
	static long getWays(int n, long[] c){
       
		 long temp[] = new long[n+1];

	        temp[0] = 1;
	        for(int i=0; i < c.length; i++){
	            for(int j=1; j <= n ; j++){
	                if(j >= c[i]){
	                    temp[j] += temp[j-(int)c[i]];
	                }
	            }
	        }
	        return temp[n];
    }

	 static long[] table=new long[1024];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
       
        for(int i=0;i<n;i++)
        	table[i]=-1;
        long ways = getWays(n, c);
        System.out.print(ways);
    }

}
