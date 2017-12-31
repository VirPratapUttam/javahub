package com.corejava.simple;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ShuffleArray {

	public static void shuffleArray(Integer[] a) {
		int n = a.length;
		Random r = new Random();
		r.nextInt();
		for (int i = 0; i < n; i++) {
			int change = i + r.nextInt(n - i);
			swap(a, i, change);
		}
	}

	public static void swap(Integer[] a, int i, int change) {
		int temp = a[i];
		a[i] = change;
		change = temp;
	}

	public static void main(String[] args) {
		Integer[] ar = { 10, 20, 30, 40, 50 };
		Collections.shuffle(Arrays.asList(ar));
		for (Integer a : ar)
			System.out.println(a);
		
		Integer[] ar1 = { 10, 20, 30, 40, 50 };
		System.out.println("Custom Shuffle Implementation");
		shuffleArray(ar1);
		for (Integer a : ar1)
			System.out.println(a);
		
	}

}
