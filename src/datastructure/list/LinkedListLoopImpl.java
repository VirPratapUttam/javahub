package datastructure.list;

public class LinkedListLoopImpl {

	/**
	 * @param args
	 */
	ListNode l1 = new ListNode(10);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = createList();
		System.out.println("Loop Exist? " + isLinkedListContainsLoop(head));
		System.out.println("Start of Loop is:-"
				+ findStartOfLoop(head).getData());
		// System.out.println("Length of Loop :-"+lengthOfLoop(head));
		printListFromEnd(head);
		System.out.println("is List length even?"
				+ isLinkedListLengthEven(head));
		
		ListNode headList1=createList1();
		ListNode headList2=createList2();
		ListNode result=mergeList(headList1,headList2);
		System.out.println("Merge List is:");
		while(result!=null)
		{
			System.out.println(result.getData());
			result=result.getNext();
		}
		ListNode headList3=createList1();
		System.out.println("Data before pair reverse");
		while(headList3!=null)
		{
			System.out.println(headList3.getData());
			headList3=headList3.getNext();
		}
		ListNode headList4=createList3();
		System.out.println("Data after pair reverse");
		reversePairRecursive(headList4);
		while(headList4!=null)
		{
			System.out.println(headList4.getData());
			headList4=headList4.getNext();
		}
		ListNode headList5=createList3();
		ListNode current=headList5;
		System.out.println("Data after pair reverse iterative");
		headList5=reversePairIterative(headList5);
		while(headList5!=null)
		{
			System.out.println(headList5.getData());
			headList5=headList5.getNext();
		}
	}
	
	public static void reversePairRecursive(ListNode head)
	{
		ListNode temp;
		if(head==null || head.getNext()==null)
			return;
		
		temp=head.getNext();
		head.setNext(temp.getNext());
		temp.setNext(head);
		reversePairRecursive(head.getNext());
	}
	
	public static ListNode reversePairIterative(ListNode head)
	{
		ListNode temp1,temp2=null,current=head,header=head;
		while(current!=null && current.getNext()!=null)
		{
		
		temp1=current.getNext();
		if(temp1!=null)
		{
			temp2=temp1.getNext();
			temp1.setNext(current);
			current.setNext(temp2);
		}
		if(current!=null)
			current=current.getNext();
		}
	 return header;
	}
	public static ListNode mergeList(ListNode l1,ListNode l2)
	{
		ListNode result;
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		if(l1.getData()<=l2.getData())
		{
			result=l1;
			result.setNext(mergeList(l1.getNext(), l2));
		}else
		{
			result=l2;
			result.setNext(mergeList(l1, l2.getNext()));
		}
		return result;
	}

	public static boolean isLinkedListLengthEven(ListNode head) {
		while (head != null && head.getNext() != null) {
			head = head.getNext().getNext();
		}
		if (head == null)
			return true;
		return false;
	}

	public static boolean isLinkedListContainsLoop(ListNode head) {
		ListNode slowPtr = head, fastPtr = head;
		while (slowPtr != null && fastPtr != null) {
			fastPtr = fastPtr.getNext();
			if (slowPtr == fastPtr)
				return true;
			if (fastPtr == null)
				return false;
			fastPtr = fastPtr.getNext();
			if (slowPtr == fastPtr)
				return true;
			slowPtr = slowPtr.getNext();
		}
		return false;
	}

	public static ListNode findStartOfLoop(ListNode head) {
		ListNode slowPtr = head, fastPtr = head;
		boolean isLoopExist = false;
		while (slowPtr != null && fastPtr != null) {
			fastPtr = fastPtr.getNext();
			if (fastPtr == null) {
				isLoopExist = false;
				break;
			}
			fastPtr = fastPtr.getNext();
			slowPtr = slowPtr.getNext();
			if (slowPtr == fastPtr) {
				isLoopExist = true;
				break;
			}
			if (fastPtr == null)
				isLoopExist = false;
			/*
			 * fastPtr=fastPtr.getNext(); slowPtr=slowPtr.getNext();
			 * if(slowPtr==fastPtr) { isLoopExist=true; break; }
			 */

		}
		if (isLoopExist) {
			slowPtr = head;
			while (slowPtr != fastPtr) {
				slowPtr = slowPtr.getNext();
				fastPtr = fastPtr.getNext();
			}
		}
		return slowPtr;
	}

	public static int lengthOfLoop(ListNode head) {
		ListNode slowPtr = head, fastPtr = head;
		int counter = 0;
		boolean isLoopExist = false;
		while (slowPtr != null && fastPtr != null) {
			fastPtr = fastPtr.getNext();
			if (fastPtr == null)
				isLoopExist = false;
			fastPtr = fastPtr.getNext();
			slowPtr = slowPtr.getNext();
			if (slowPtr == fastPtr) {
				isLoopExist = true;
				break;
			}
			if (fastPtr == null)
				isLoopExist = false;
			/*
			 * fastPtr=fastPtr.getNext(); slowPtr=slowPtr.getNext();
			 * if(slowPtr==fastPtr) { isLoopExist=true; break; }
			 */

		}
		if (isLoopExist) {
			slowPtr = fastPtr.getNext();
			counter++;
			while (slowPtr != fastPtr) {
				slowPtr = slowPtr.getNext();
				counter++;
			}
		}
		return counter;
	}

	public static void printListFromEnd(ListNode head) {
		if (head == null)
			return;
		printListFromEnd(head.getNext());
		System.out.println(head.getData());
	}

	public static ListNode createList() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		ListNode l9 = new ListNode(9);
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(l6);
		l6.setNext(l7);
		l7.setNext(l8);
		l8.setNext(l9);
		// l9.setNext(l4);
		return l1;
	}

	public static ListNode createList2() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(13);
		ListNode l4 = new ListNode(14);

		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);

		return l1;
	}
	
	public static ListNode createList3() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(13);
		ListNode l4 = new ListNode(14);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(l6);

		return l1;
	}

	public static ListNode createList1() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		ListNode l9 = new ListNode(9);
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(l6);
		l6.setNext(l7);
		l7.setNext(l8);
		l8.setNext(l9);
		// l9.setNext(l4);
		return l1;
	}

}
