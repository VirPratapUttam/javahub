package datastructure.stack;

import java.util.Stack;

public class SpanProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 6, 3, 4, 5, 1 };
		int[] spans=new int[a.length];
		spans=findingSpan(a);
		for (int p : spans)
			System.out.println(p);
		System.out.println("Stack finding span");
		spans=findingSpansStack(a);
		for (int p : spans)
			System.out.println(p);
		
		
	}
	public static int[] findingSpansStack(int[] input)
	{
		int[] spans=new int[input.length];
		int p=0;
		Stack stack=new Stack();
		for(int i=0;i<input.length;i++)
		{
			while(!stack.isEmpty() && input[i]>input[(int)stack.peek()])
			{
				stack.pop();
			}
			if(stack.isEmpty())
				p=-1;
			else
				p=(int)stack.peek();
			spans[i]=i-p;
			stack.push(i);
		}
		return spans;
	}
	
	/*public static int[] findingSpanStack(int [] inputArray)
	{
		int[] spans=new int[inputArray.length];
		Stack stack=new Stack();
		int p=0;
		for(int i=0;i<inputArray.length;i++)
		{
			while(!stack.isEmpty() && inputArray[i]>inputArray[(int)stack.peek()])
			{
				stack.pop();
			}
			if(stack.isEmpty())
				p=-1;
			else
				p=(int)stack.peek();
			spans[i]=i-p;
			stack.push(i);
		}
		return spans;
	}*/

	public static int[] findingSpan(int[] inputArray) {
		int[] spans = new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			int span = 1;
			int j = i - 1;
			while (j >= 0 && inputArray[j] < inputArray[j + 1]) {
				span++;
				j--;
			}
			spans[i] = span;
		}
		return spans;
	}

}
