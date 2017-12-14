package com.algorithm.dp;
	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class LISLength {
	    
	    static int LISLength(int[] arr,int n)
	    {
	        int max=0;
	       int[] LISTable=new int[n];
	        
	        for(int i=0;i<n;i++)
	        {
	            LISTable[i]=1;
	            for(int j=0;j<i;j++)
	            {
	                if(arr[i]>arr[j] && LISTable[i]<LISTable[j]+1)
	                    LISTable[i]=LISTable[j]+1;
	                if(max<LISTable[i])
	                    max=LISTable[i];
	            }
	        }
	       
	        return max;
	    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=in.nextInt();
	        }
	        System.out.println(LISLength(arr,n));
	    }
	}

