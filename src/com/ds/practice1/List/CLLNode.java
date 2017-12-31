package com.ds.practice1.List;

class CLLNode<T> {
	private T data;
	private CLLNode<T> next;
	private CLLNode<T> headNode;
	private CLLNode<T> currentNode;
	private CLLNode<T> previousNode;

	public CLLNode(T data) {
		this.data = data;
		this.next=this;
	}

	public CLLNode() {
	}

	public void deleteAtBeginning() {
		CLLNode<T> temp = headNode;
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
		CLLNode<T> newNode = new CLLNode<T>(data);
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
		CLLNode<T> newNode = new CLLNode<T>(data);
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
		CLLNode<T> newNode = new CLLNode<T>(data);
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

	public void display() {
		currentNode = headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public int peek() {
		currentNode = headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		return (int) currentNode.data;
	}
}
