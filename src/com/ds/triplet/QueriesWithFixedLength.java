package com.ds.triplet;

import java.io.*;
import java.util.*;

public class QueriesWithFixedLength {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] arr=new int[n];
        PriorityQueue<Integer> qq=new PriorityQueue();
        
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++)
        {
        	int d=sc.nextInt();
        	int max=Integer.MIN_VALUE;
        	int min=Integer.MAX_VALUE;
        	System.out.println(min);
        	qq.clear();
        	for(int j=0;j<n;)
        	{
        		qq.add(arr[j]);
        		int qSize=qq.size();
        		if(qSize==d)
        		{
        			for(int x=0;x<qSize;x++)
        			{
        				int p=qq.poll();
        				max=max<p?p:max;
        			}
        			if(min>max)
        			{
                		min=max;
        			}
        			max=Integer.MIN_VALUE;
        			j=j-(d-1)+1;
        		}
        		else
        		{
        			j++;
        		}
        	}
        	
        	System.out.println("min value  :-"+min);
        }
        
    }
}
