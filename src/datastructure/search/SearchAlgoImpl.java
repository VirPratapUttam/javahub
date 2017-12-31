package datastructure.search;

import java.util.Arrays;
import java.util.HashMap;

public class SearchAlgoImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 6, 7, 8, 12, 24 };
		System.out.println(binarySearch(a, 0, a.length, 6));
		System.out.println(binarySearch(a, 0, a.length, 9));
		System.out.println(linearSearch(a, a.length, 7));
		System.out.println(linearSearch(a, a.length, 9));
		int[] b = { 1, 2, 4, 5, 7, 6 };
		System.out.println(findMissing(b, b.length));
		System.out.println(findMissingXOR(b, b.length));
		
		int[] c={3,4,5,1,2};
		System.out.println(binarySearch(c, 0,c.length-1 , c.length, 1));
	}

	/*
	 * Input arr[] = {3, 4, 5, 1, 2} Element to Search = 1 1) Find out pivot
	 * point and divide the array in two sub-arrays. (pivot = 2) /*Index of 5
	 * 
	 * 2)
	 * 
	 * Now call binary search for one of the two sub-arrays.(a) If element is
	 * greater than 0 th element then search in left
	 * 
	 * array (b) Else Search in right array (1 will go in else as 1 < 0
	 * 
	 * th element(3)) 3) If element is found in selected sub-array then return
	 * index Else return -1.
	 */
	public static int binarySearch(int[] arr,int n,int key)
	{
		System.out.println("Inside");
		int mid=findPivot(arr,0,n-1);
		
		 if (mid == -1)
	           return binarySearch(arr, n, key);
		 
		if(s==arr[mid])
			return s;
		if(s>arr[mid])
			binarySearch(arr, low, mid-1,n, s);
		else
			binarySearch(arr, mid+1, high,n, s);
		
		return -1;
	}
	public static int findPivot(int[] arr,int low,int high)
	{
		 if (high < low)  
	            return -1;
	       if (high == low) 
	            return low;
	        
	       /* low + (high - low)/2; */
	       int mid = (low + high)/2;   
	       if (mid < high && arr[mid] > arr[mid + 1])
	           return mid;
	       if (mid > low && arr[mid] < arr[mid - 1])
	           return (mid-1);
	       if (arr[low] >= arr[mid])
	           return findPivot(arr, low, mid-1);
	       return findPivot(arr, mid + 1, high);
	}

	public static int findMissing(int[] a, int n) {
		int sum = (n + 1) * (n + 2) / 2;

		for (int i = 0; i < n; i++) {
			sum -= a[i];
		}
		return sum;
	}

	public static int findMissingXOR(int[] a, int n) {
		int x1 = a[0];
		int x2 = 1;
		for (int i = 1; i < n; i++) {
			x1 = x1 ^ a[i];
		}
		for (int i = 2; i <= n + 1; i++) {
			x2 = x2 ^ i;
		}
		return (x1 ^ x2);
	}

	public static void checkDuplicatesBruteForce(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate Exist");
					return;
				}
			}
		}
	}

	public static boolean binarySearch(int[] a, int l, int r, int s) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (a[mid] == s)
				return true;
			if (a[mid] > s)
				return binarySearch(a, l, mid - 1, s);

			return binarySearch(a, mid + 1, r, s);
		}
		return false;
	}

	public static boolean linearSearch(int[] a, int n, int s) {
		for (int i = 0; i < n; i++) {
			if (a[i] == s) {
				return true;
			}
		}
		return false;
	}

	public static void checkDuplicatesSort(int[] a, int n) {
		Arrays.sort(a);
		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1]) {
				System.out.println("Duplicate");
				return;
			}
		}
	}

	public static void checkDuplicatesHashing(int[] a, int n) {
		HashMap map = new HashMap();
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = 0;
			if (map.containsKey(a[i]))
				System.out.println("Duplicate exist");
			map.put(a[i], count++);
		}
	}

}
