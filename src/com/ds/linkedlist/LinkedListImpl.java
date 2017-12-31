package com.ds.linkedlist;

public class LinkedListImpl {

	public static void main(String[] args) {
		ListNode head = null;
		LinkedList list = new LinkedList();
		head = list.insert(head, 10, 0);
		head = list.insert(head, 20, 0);
		head = list.insert(head, 30, 1);
		head = list.insert(head, 40, 0);
		head = list.insert(head, 10, 0);
		list.print(head);
		System.out.println(list.length(head));
		list.search(head, 10);
		list.search(head, 50);
		System.out.println(list.findNthNode(head, 2).getData());
		System.out.println(list.findMiddle(head).getData());
		System.out.println(list.findMiddleOneIteration(head).getData());
		System.out.println(list.findNthFromEnd(head, 3).getData());
		System.out.println(list.countOccurances(head, 10));
	}

}
