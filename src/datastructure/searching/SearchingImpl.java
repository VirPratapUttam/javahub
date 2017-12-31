package datastructure.searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SearchingImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 4, 5, 6, 1 };
		int b[] = { 1, 3, 4, 5, 6 };
		int c[] = { 1, 2, 3, 0, 4 };
		checkDuplicatesBruteForce(a, 6);
		checkDuplicatesBruteForce(b, 5);
		checkDuplicatesSorting(a, 6);
		checkDuplicatesSorting(b, 5);
		checkDuplicatesHashing(a, 6);
		checkDuplicatesHashing(b, 5);
		checkDuplicatesNegation(a, 6);
		// will give error java.lang.ArrayIndexOutOfBoundsException: -3 because
		// elements are not in range from 0 to n-1
		// checkDuplicatesNegation(b,5);
		checkDuplicatesNegation(c, 5);
		int d[] = { 1, 3, 1, 3, 1, 1 };
		maxRepetiionBruteForce(d, 6);
		int e[] = { 1, 3, 4, 5, 6 };
		maxRepetiionBruteForce(e, 5);
		maxRepetitionSorting(d, 6);
		maxRepetitionSorting(e, 5);
		maxRepetiionHashing(d, 6);
		
		int[] sortedArray={1,9,3,4,15,5,5,5,6,7,8};
		sumSearch(sortedArray, 11, sortedArray.length);
		sumSearch(sortedArray, 20, sortedArray.length);
		sumSearchSort(sortedArray, 11, sortedArray.length);
		sumSearchSort(sortedArray, 20, sortedArray.length);
		minSum(sortedArray, sortedArray.length);
		monotonicalSearch(sortedArray, sortedArray.length, 0, sortedArray.length);
		System.out.println(firstOccuranceDuplicate(sortedArray, 0, sortedArray.length-1, 5));
		System.out.println(firstOccuranceDuplicate(sortedArray, 0, sortedArray.length-1, 9));
		System.out.println(lastOccuranceDuplicate(sortedArray, 0, sortedArray.length-1, 5));
		System.out.println(lastOccuranceDuplicate(sortedArray, 0, sortedArray.length-1, 9));
		System.out.println("Repeat count :- "+repeatCount(sortedArray, sortedArray.length, 5));
		System.out.println("Repeat count :- "+repeatCountOccurance(sortedArray, sortedArray.length, 5));
		int[] ma={1,1,1,1,1,1,1,2,2,2,4,5,5,5,5,6,7,8};
		System.out.println("Majority Number:- "+MajorityNum(ma,ma.length));

	}
	public static int MajorityNum(int[] a,int n)
	{
		int count=0,element=-1;
		for(int i=0;i<n;i++)
		{
			if(count==0)
			{
				element=a[i];
				count=1;
			}
			else if(element==a[i])
			{
				count++;
			}
			else
			{
				count--;
			}
		}
		return element;
	}
	public static int repeatCountOccurance(int[] a,int n,int data)
	{
		int f1=firstOccuranceDuplicate(a, 0, n, data);
		int l1=lastOccuranceDuplicate(a, 0, n, data);
		return l1-f1+1;
	}
	public static int repeatCount(int[] a,int n,int data)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==data)
				count++;
		}
		return count;
	}

	private static void maxRepetiionHashing(int[] d, int n) {
		// TODO Auto-generated method stub
		Map hashmap = new HashMap();
		int counter = 0;
		for (int i = 0; i < n; i++) {
			if (hashmap.containsKey(d[i])) {
				counter = (int) hashmap.get(d[i]);
				counter++;
				hashmap.put(d[i], counter);
			} else {
				counter = 0;
				hashmap.put(d[i], counter);
			}
		}
		System.out.println(hashmap.entrySet());
	}

	private static void maxRepetitionSorting(int[] d, int n) {
		Arrays.sort(d);
		int counter = 0, max = 0;
		for (int i = 0; i < n - 1; i++) {
			if (d[i] == d[i + 1]) {
				counter++;
			} else {
				counter = 0;
			}
			if (counter > max)
				max = counter;
		}
		System.out.println("Max using Sorting is:-" + max);
	}

	public static void checkDuplicatesBruteForce(int A[], int n) {
		boolean isDuplicateExist = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] == A[j]) {
					isDuplicateExist = true;
					break;
				}
			}
		}
		if (isDuplicateExist)
			System.out.println("Duplicate Exist");
		else
			System.out.println("Not Exist");
	}

	public static void maxRepetiionBruteForce(int A[], int n) {
		int max = 0, counter = 0;
		for (int i = 0; i < n - 1; i++) {
			counter = 0;
			for (int j = i + 1; j < n; j++) {
				if (A[i] == A[j]) {
					counter++;
				}
			}
			if (counter > max)
				max = counter;
		}
		System.out.println("Max is :- " + max);
	}

	public static void checkDuplicatesSorting(int A[], int n) {
		Arrays.sort(A);
		for (int i = 0; i < n - 1; i++) {
			if (A[i] == A[i + 1]) {
				System.out.println("Duplicate Exist");
				return;
			}
		}
		System.out.println("Not Exist");
	}

	public static void checkDuplicatesHashing(int A[], int n) {
		Map hashMap = new HashMap();
		for (int i = 0; i < n; i++) {
			if (hashMap.containsKey(A[i])) {
				System.out.println("Duplicate Exist");
				return;
			}
			hashMap.put(A[i], 0);
		}
		System.out.println("Not Exist in hashtable");
	}

	public static void checkDuplicatesNegation(int A[], int n) {
		for (int i = 0; i < n; i++) {
			if (A[Math.abs(A[i])] < 0) {
				System.out.println("Duplicate Exist -- Negation");
				return;
			} else
				A[Math.abs(A[i])] = -A[Math.abs(A[i])];
		}
		System.out.println("Not Exist using Negation");
	}

	public static void sumSearch(int[] a, int sum, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println("The two elements with max sum are " + a[i] + " and "
							+ a[j]);
					return;
				}
			}
		}
		System.out.println("Items not found: No such element");
	}

	public static void sumSearchSort(int[] a, int sum, int n) {
		int i, j, temp;
		Arrays.sort(a);
		for (i = 0, j = n - 1; i < j;) {
			temp = a[i] + a[j];
			if (temp == sum) {
				System.out.println("The two elements with max sum are " + a[i] + " and "
						+ a[j]);
				return;
			} else if (temp < sum)
				i++;
			else
				j--;
		}
		System.out.println("Items not found: No such element");
	}

	public static void minSum(int[] a, int n) {
		int i, j, min_sum, sum, min_i, min_j;
		if (n < 2) {
			System.out.println("Invalid Input");
			return;
		}
		min_i = 0;
		min_j = 1;
		min_sum = a[0] + a[1];
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				sum = a[i] + a[j];
				if (Math.abs(min_sum) > Math.abs(sum)) {
					min_sum = sum;
					min_i = i;
					min_j = j;
				}
			}
		}
		System.out.println("The two elements are" + a[min_i] + " and "
				+ a[min_j]);
	}

	public static int monotonicalSearch(int[] a, int n, int start, int end) {
		int mid, first = 0, last = n - 1;
		while (first <= last) {
			if (first == last)
				return a[first];
			if (first == last - 1) {
				if (a[first] >= a[last - 1])
					return a[first];
				else
					return a[last - 1];
			} else {
				mid = (first + (last - first)) / 2;
				if (a[mid] > a[mid - 1] && a[mid] < a[mid + 1])
					return a[mid];
				else if (a[mid - 1] < a[mid] && a[mid] < a[mid + 1])
					first = mid + 1;
				else if (a[mid - 1] > a[mid] && a[mid] > a[mid + 1])
					last = mid - 1;
				else
					return Integer.MIN_VALUE;
			}
		}
		return Integer.MIN_VALUE;
	}

	public static int firstOccuranceDuplicate(int[] a, int low, int high,
			int data) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if (mid == low && a[mid] == data || a[mid] == data
					&& a[mid - 1] < data)
				return mid;
			else if (a[mid] >= data)
				return firstOccuranceDuplicate(a, low, mid - 1, data);
			else
				return firstOccuranceDuplicate(a, mid + 1, high, data);
		}
		return -1;
	}

	public static int lastOccuranceDuplicate(int[] a, int low, int high,
			int data) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if (mid == high && a[mid] == data || a[mid] == data
					&& a[mid + 1] > data)
				return mid;
			else if (a[mid] <= data)
				return lastOccuranceDuplicate(a, mid + 1, high, data);
			else
				return lastOccuranceDuplicate(a, low, mid - 1, data);
		}
		return -1;
	}
}
