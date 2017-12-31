package com.ds.triplet;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Sum:");
		int sum=sc.nextInt();
	
		int tripletCount=countTriplets(arr,sum,n);
		System.out.println(tripletCount);

	}

	private static int countTriplets(int[] arr, int sum,int  n) {
		int triplets=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]<sum)
					{
						triplets++;
					}
				}
			}
		}
		return triplets;
		
	}

}
