package com.ds.practice1.List;

public class CustomQueue<T> {
	ListNode<T> l1=new ListNode<>();
	
	public void enqueue(T data)
	{
		l1.addNodeAtEnd(data);
	}
	public void dequeu(){
		l1.deleteAtBeginning();
	}
    public void display()
    {
    	l1.display();
    }
}
 