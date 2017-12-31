package com.ds.practice1.List;


public class CustomStack<T> {
	ListNode<T> l1=new ListNode<>();
	
	public void push(T data)
	{
		l1.addNodeAtEnd(data);
	}
	public void pop()
	{
		l1.deleteAtLast();
	}
	public void display()
	{
		l1.display();
	}
	public T peek()
	{
		return l1.peek();
	}
}
