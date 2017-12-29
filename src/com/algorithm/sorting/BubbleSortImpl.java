package com.algorithm.sorting;

import java.util.Scanner;

public class BubbleSortImpl {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	    arr=bubbleSort(arr,n);
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}

	private static int[] bubbleSort(int[] arr,int n) {
		boolean swapped=true;
		for(int i=n-1;i>=0 && swapped ;i--)
		{
			swapped=false;
			for(int j=0;j<=i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
		}
		return arr;
	}
}
