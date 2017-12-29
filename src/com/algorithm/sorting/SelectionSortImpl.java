package com.algorithm.sorting;

import java.util.Scanner;

public class SelectionSortImpl {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	    arr=selectionSort(arr,n);
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
		sc.close();
	}

	private static int[] selectionSort(int[] arr,int n) {
		int min=Integer.MAX_VALUE;
		int pos=0;
		for(int i=0;i<n;i++)
		{
			min=arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr;
	}
}
