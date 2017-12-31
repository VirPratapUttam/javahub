package com.ds.practice1.List;

public class LinkedListImpl {

	public static void main(String[] args) {
		ListNode<Integer> list1=new ListNode<Integer>();
		list1.addNodeAtBeginning(4);
		list1.addNodeAtBeginning(3);
		list1.addNodeAtBeginning(2);
		list1.addNodeAtBeginning(1);
		
		System.out.println("Displaying element after inserting");
		list1.display();
		list1.addNodeAtEnd(5);
		list1.addNodeAtEnd(6);
		System.out.println("Displaying after inserting at End");
		list1.display();
		
		System.out.println("After inserting in the middle");
		list1.addNodeAtMiddle(7, 1);
		list1.addNodeAtMiddle(8, 0);
		list1.addNodeAtMiddle(4, 2);
		list1.addNodeAtMiddle(9, 7);
		list1.addNodeAtMiddle(10, 9);
		list1.display();
		
		System.out.println("Delete at Beginnnig");
		list1.deleteAtBeginning();
		list1.deleteAtBeginning();
		list1.display();
		
		System.out.println("Delete at end");
		list1.deleteAtLast();
		list1.display();
		
		System.out.println("Delete at Middle");
		list1.deleteAtMiddle(2);
		list1.deleteAtMiddle(4);
		list1.display();
		
		System.out.println(2+" position from End "+list1.findNthNodeFromEnd(2));
		
		/*System.out.println("Cycle List");
		list1.createCycleList();
		System.out.println("Cycle exist: "+list1.isCycleExist());*/
		
		list1.createList();
		System.out.println("Cycle exist: "+list1.isCycleExist());
		list1.display();
		
		System.out.println("Start of Cycle:"+list1.startOfCycle());
		
		System.out.println("Length of loop is:"+list1.lengthOfLoop());
		list1.insertInSortedList(25);
		System.out.println("After Inserted in sorted List");
		list1.display();
		
		System.out.println("Reverse List");
		list1.reverseList();
		list1.display();
		
		ListNode<Integer> l1=new ListNode<>();
		ListNode<Integer> node1=new ListNode<>(10);
		ListNode<Integer> node2=new ListNode<>(20);
		ListNode<Integer> node3=new ListNode<>(30);
		ListNode<Integer> node4=new ListNode<>(40);
		ListNode<Integer> node5=new ListNode<>(50);
		ListNode<Integer> node6=new ListNode<>(60);

		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		l1.setHeadNode(node1);
		
		
		ListNode<Integer> l2=new ListNode<>();
		ListNode<Integer> node10=new ListNode<>(80);
		ListNode<Integer> node11=new ListNode<>(90);
		ListNode<Integer> node12=new ListNode<>(100);
		node10.setNext(node11);
		node11.setNext(node12);
		node12.setNext(node3);
		l2.setHeadNode(node10);
		
		System.out.println("List 1");
		l1.display();
		System.out.println("List 2");
		l2.display();
		
		//System.out.println("Intersection point :"+list1.findInterSection(node1, node10).getData());
		
	}

}
