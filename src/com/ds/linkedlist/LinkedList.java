package com.ds.linkedlist;
/*
 * Insert/Delete/search/Length/Print/Nth/find middle/nth node from end of the list/delete linked list
 * count the given int
 */

public class LinkedList {
	public ListNode deleteList(ListNode head)
	{
		return head=null;
	}
	public int countOccurances(ListNode head,int data)
	{
		ListNode current=head;
		int count=0;
		while(current!=null)
		{
			if(current.getData()==data)
			{
				count++;
			}
			current=current.getNext();
		}
		return count;
	}
	public ListNode findNthFromEnd(ListNode head,int k)
	{
		int len=length(head);
		int position=len-k;
		int count=1;
		ListNode current=head;
		while(count<position)
		{
			current=current.getNext();
			count++;
		}
		return current;
	}
	public ListNode findMiddleOneIteration(ListNode head)
	{
		ListNode firstPtr=head;
		ListNode secPtr=head;
		while(secPtr!=null && secPtr.getNext()!=null)
		{
			firstPtr=firstPtr.getNext();
			secPtr=secPtr.getNext().getNext();
		}
		return firstPtr;
	}
	public ListNode findMiddle(ListNode head)
	{
		int len=length(head);
		int mid=len/2;
		int count=0;
		ListNode current=head;
		while(count<mid && current!=null)
		{
			current=current.getNext();
			count++;
		}
		return current;
	}
	
	public ListNode findNthNode(ListNode head,int position)
	{
		ListNode current=head;
		int count=1;
		while(current!=null && count<position)
		{
			current=current.getNext();
			count++;
		}
		return current;
	}
	public ListNode delete(ListNode head, int position) {
		if (position < 0) {
			System.out.println("Invalid Position");
			System.exit(0);
		}
		if (position == 0) {
			return head = deleteAtBeginning(head);
		}
		int count = 0;
		ListNode previous = head;
		ListNode current = head;
		while (count < position) {
			previous = current;
			current = current.getNext();
			count++;
		}
		previous.setNext(current.getNext());
		return head;
	}

	private ListNode deleteAtBeginning(ListNode head) {
		return head = head.getNext();
	}

	public void search(ListNode head, int data) {
		ListNode current = head;
		boolean isFound = false;
		while (current != null) {
			if (current.getData() == data) {
				isFound = true;
				break;
			}
			current = current.getNext();
		}
		if (isFound)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}

	public int length(ListNode head) {
		ListNode current = head;
		int len = 0;
		while (current != null) {
			len++;
			current = current.getNext();
		}
		return len;
	}

	public void print(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	public ListNode insert(ListNode head, int data, int position) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			return head = newNode;
		}
		if (position < 0) {
			System.out.println("Invalid Position");
			System.exit(0);
		}
		if (position == 0) {
			return head = insertAtBegining(head, newNode);
		}
		int count = 0;
		ListNode current = head;
		while (count < position) {
			current = current.getNext();
			count++;
		}
		newNode.setNext(current.getNext());
		current.setNext(newNode);
		return head;
	}

	public ListNode insertAtBegining(ListNode head, ListNode newNode) {
		newNode.setNext(head);
		return head = newNode;
	}
}
