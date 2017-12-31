package com.corejava.simple;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr=new int[10];
		int[][] multArr=new int[2][2];
		int[] arrInt={2,3,4,5,6,7};
		
		System.out.println("Setting the array value");
		for(int x:arrInt)
			System.out.println(x);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		System.out.println("Array Initialize");
		for(int x:arr)
			System.out.println(x);
		
		multArr[0][0]=1;
		multArr[0][1]=2;
		multArr[1][0]=3;
		multArr[1][1]=4;
		
		System.out.println("Two Dimentional Array");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.println(multArr[i][j]);
			}
		}
	}

}
