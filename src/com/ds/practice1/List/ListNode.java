package com.ds.practice1.List;

class ListNode<T> {
	private T data;
	private ListNode<T> next;
	private ListNode<T> headNode;
	private ListNode<T> currentNode;
	private ListNode<T> previousNode;

	public ListNode(T data) {
		this.data = data;
	}

	public ListNode() {
	}
	
	public ListNode<T> getHeadNode() {
		return headNode;
	}

	public void setHeadNode(ListNode<T> headNode) {
		this.headNode = headNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}
	
	/*public ListNode<T> findInterSection(ListNode<T> head1,ListNode<T> head2)
	{
		int size1=size(head1);
		int size2=size(head2);
		int diff=Math.abs(size1-size2);
		ListNode<T> firstcurrentNode=size1>size2?head1:head2;
		int count=0;
		while(count<diff)
		{
			firstcurrentNode=firstcurrentNode.next;
			count++;
		}
		while(first)
		return currentNode;
	}*/

	public void deleteAtBeginning() {
		ListNode<T> temp = headNode;
		headNode = headNode.next;
		temp = null;
	}

	public void deleteAtLast() {
		currentNode = headNode;
		while (currentNode.next != null) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		previousNode.next = null;
		currentNode = null;
	}

	public void deleteAtMiddle(int position) {
		int size = listSize();
		if (position < 0 || position > size) {
			System.out.println("Invalid Position");
			return;
		}
		currentNode = previousNode = headNode;
		int pos = 1;
		while (currentNode.next != null && pos < position) {
			pos++;
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		previousNode.next = currentNode.next;
		currentNode = null;
	}

	public void addNodeAtBeginning(T data) {
		if (data == null) {
			System.out.println("Data cant be null");
			return;
		}
		ListNode<T> newNode = new ListNode<T>(data);
		if (headNode == null) {
			headNode = newNode;
			return;
		}

		newNode.next = headNode;
		headNode = newNode;
	}

	public void addNodeAtEnd(T data) {
		if (data == null) {
			System.out.println("Invalid Data");
			return;
		}
		ListNode<T> newNode = new ListNode<T>(data);
		if(headNode==null)
		{
			headNode=newNode;
			return;
		}
		currentNode = headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}

	public void addNodeAtMiddle(T data, int position) {
		int size = listSize();
		if (position < 1 || position > size + 1) {
			System.out.println("Invalid Position:" + position);
			return;
		}
		if (position == 1) {
			addNodeAtBeginning(data);
			return;
		}
		ListNode<T> newNode = new ListNode<T>(data);
		int currentPos = 2;
		currentNode = headNode;
		while (currentNode.next != null && currentPos < position) {
			currentNode = currentNode.next;
			currentPos++;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	}

	private int listSize() {
		currentNode = headNode;
		int size = 0;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
			size++;
		}
		return size;
	}
	private int size(ListNode<T> head) {
		currentNode = head;
		int size = 1;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
			size++;
		}
		return size;
	}

	public void display() {
		currentNode = headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public T peek() {
		currentNode = headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		return  currentNode.data;
	}
	public T findNthNodeFromEnd(int position)
	{
		ListNode<T> firstPtr;
		ListNode<T> secPtr;
		firstPtr=secPtr=headNode;
		int count=1;
		while(count<position && firstPtr.next!=null)
		{
			firstPtr=firstPtr.next;
			count++;
		}
		while(firstPtr.next!=null)
		{
			firstPtr=firstPtr.next;
			secPtr=secPtr.next;
		}
		return secPtr.data;
		
	}
	public ListNode<T> createCycleList()
	{
		ListNode<Integer> node1=new ListNode<>(10);
		ListNode<Integer> node2=new ListNode<>(20);
		ListNode<Integer> node3=new ListNode<>(30);
		ListNode<Integer> node4=new ListNode<>(40);
		ListNode<Integer> node5=new ListNode<>(50);
		ListNode<Integer> node6=new ListNode<>(60);

		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node3;
		return headNode=(ListNode<T>) node1;
	}
	public ListNode<T> createList()
	{
		ListNode<Integer> node1=new ListNode<>(10);
		ListNode<Integer> node2=new ListNode<>(20);
		ListNode<Integer> node3=new ListNode<>(30);
		ListNode<Integer> node4=new ListNode<>(40);
		ListNode<Integer> node5=new ListNode<>(50);
		ListNode<Integer> node6=new ListNode<>(60);

		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		return headNode=(ListNode<T>) node1;
	}
	
	
	
	public void reverseList()
	{
		ListNode<T> temp=null;
		ListNode<T> nextNode=null;
		
		while(headNode!=null)
		{
			nextNode=headNode.next;
			headNode.next=temp;
			temp=headNode;
			headNode=nextNode;
		}
		headNode=temp;
	}
	
	public void insertInSortedList(T data)
	{
		currentNode=headNode;
		ListNode<T> newNode=new ListNode<>(data);
		while(currentNode!=null && (int)data>(int)currentNode.data)
		{
			previousNode=currentNode;
			currentNode=currentNode.next;
		}
		newNode.next=currentNode;
		previousNode.next=newNode;
	}
	
	public int lengthOfLoop()
	{
		ListNode<T> slowPtr;
		ListNode<T> fastPtr;
		slowPtr=fastPtr=headNode;
		
		slowPtr=slowPtr.next;
		fastPtr=fastPtr.next.next;
		
		while(fastPtr!=null && fastPtr.next!=null && fastPtr!=slowPtr)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		int count=1;
		if(slowPtr==fastPtr)
		{
			slowPtr=slowPtr.next;
			while(slowPtr!=fastPtr)
			{
				slowPtr=slowPtr.next;
				count++;
			}
		}
		return count;
	}
	
	public T startOfCycle()
	{
		ListNode<T> slowPtr;
		ListNode<T> fastPtr;
		slowPtr=fastPtr=headNode;
		
		slowPtr=slowPtr.next;
		fastPtr=fastPtr.next.next;
		
		while(fastPtr!=null && fastPtr.next!=null && fastPtr!=slowPtr)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		if(slowPtr==fastPtr)
		{
			slowPtr=headNode;
			while(slowPtr!=fastPtr)
			{
				slowPtr=slowPtr.next;
				fastPtr=fastPtr.next;
			}
		}
		return slowPtr.data;
	}
	
	public boolean isCycleExist()
	{
		ListNode<T> slowPtr;
		ListNode<T> fastPtr;
		slowPtr=fastPtr=headNode;
		
		slowPtr=slowPtr.next;
		fastPtr=fastPtr.next.next;
		
		while(fastPtr!=null && fastPtr.next!=null && fastPtr!=slowPtr)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr==fastPtr?true:false;
	}
}
