package datastructure.stack;

import java.util.Stack;

public class StackSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
		s1.push(6);
		s1.push(5);
		s1.push(4);
		s1.push(10);
		s1.push(1);
		Stack descSortedStack=stackSort(s1);
		Stack ascSortedStack = new Stack();;
		System.out.println("Descending order");
		while(!descSortedStack.isEmpty())
		{
			int tmp=(int) descSortedStack.pop();
			ascSortedStack.push(tmp);
			System.out.println(tmp);
		}
		
		System.out.println("Ascending order");
		while(!ascSortedStack.isEmpty())
		{
			int tmp=(int) ascSortedStack.pop();
			System.out.println(tmp);
		}
		

	}
	public static Stack stackSort(Stack s)
	{
		Stack r=new Stack();
		while(!s.isEmpty())
		{
			int tmp=(int)s.pop();
			while(!r.isEmpty() && (int) r.peek()>tmp)
			{
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}

}
