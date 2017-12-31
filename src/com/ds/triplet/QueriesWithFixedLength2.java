package com.ds.triplet;

import java.io.*;
import java.util.*;

public class QueriesWithFixedLength2 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];


		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j < q; ++j) {
			int d = sc.nextInt();
			Queue<Integer> qu = new LinkedList<>();
			int myMin = Integer.MAX_VALUE;

			for (int i = 0; i < arr.length; ++i) {
				if (qu.size() == d) {
					qu.remove();
					if (qu.size() > 0) {
						int cMax = qu.peek();
						for (int element : qu) {
							if (element >= cMax) {
								cMax = element;
							}
						}
						while (qu.peek() < cMax) {
							qu.remove();
						}
					}
				}
				while (qu.size() > 0 && arr[i] >= qu.peek()) {
					qu.remove();
				}
				qu.add(arr[i]);
				int m = qu.peek();
				if (m < myMin && i >= d - 1) {
					myMin = m;
				}
			}
			System.out.println(myMin);
		}
	}

}
