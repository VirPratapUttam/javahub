package datastructure.queue;

import java.util.Stack;

public class QueueWithTwoStack {
	Stack s1;
	Stack s2;
	
	public QueueWithTwoStack()
	{
		s1=new Stack();
		s2=new Stack();
	}
	public boolean isEmpty()
	{
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		return s2.isEmpty();
	}
	public void enqueue(int data)
	{
		s1.push(data);
	}
	public int dequeue()
	{
		if(!s2.isEmpty())
			return (int) s2.pop();
		else
			while(!s1.isEmpty())
				s2.push(s1.pop());
		return (int) s2.pop();
	}

}
