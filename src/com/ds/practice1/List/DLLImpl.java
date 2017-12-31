package com.ds.practice1.List;

public class DLLImpl {

	public static void main(String[] args) {
		DLLNode<Integer> list1=new DLLNode<Integer>();
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
		
		System.out.println("Displaying in reverse order");
		list1.displayInReverse();
		
	}

}
