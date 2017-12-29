package com.algorithm.sorting;

import java.util.Scanner;

public class InsertionSortImpl {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	    arr=insertionSort(arr,n);
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
		sc.close();
	}

	private static int[] insertionSort(int[] arr,int n) {
		for(int i=1;i<n;i++)
		{
			int val=arr[i];
			int pos=i;
			while(pos>0 && arr[pos-1]>val)
			{
				arr[pos]=arr[pos-1];
				pos--;
			}
			arr[pos]=val;
		}
		return arr;
	}
}
