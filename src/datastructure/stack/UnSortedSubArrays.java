package datastructure.stack;

import java.util.Stack;

public class UnSortedSubArrays {
	public static void main(String[] args) {
		int[] array1 = { 1, 13, 2, 4, 17, 18, 19, 20, 22 };
		unsortedSubArrays(array1);
		int[] array2 = { 1, 13, 2, 4, 17, 18, 19, 2, 22 };
		unsortedSubArrays(array2);
		int[] array3 = { 1, 13, 2, 4, 17, 18, 19, 2, 1 };
		unsortedSubArrays(array3);
		int[] array4 = { 31, 13, 2, 4, 17, 18, 19, 2, 22 };
		unsortedSubArrays(array4);
	}
	
	public static void unsortedSubArrays(int[] array)
	{
		Stack<Integer> stack = new Stack<>();
		int start = -1;
		int end = -1;
		stack.push(array[0]);
		for (int i = 1; i < array.length; i++) {
			if (stack.peek() > array[i]) {
				if (start == -1)
					start = i - 1;
				end = i;
			} else {
				stack.push(array[i]);
			}

		}

		System.out.println("Sort array between index "+start + " and index " + end);
	}
}
