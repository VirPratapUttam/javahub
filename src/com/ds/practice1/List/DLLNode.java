package com.ds.practice1.List;

class DLLNode<T> {
	private T data;
	private DLLNode<T> next;
	private DLLNode<T> previous;
	private DLLNode<T> headNode;
	private DLLNode<T> currentNode;
	private DLLNode<T> previousNode;

	public DLLNode(T data) {
		this.data = data;
	}

	public DLLNode() {
	}

	public void deleteAtBeginning() {
		DLLNode<T> temp = headNode;
		headNode = headNode.next;
		headNode.previous=null;
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
		int pos=1;
		while (currentNode.next != null && pos<position) {
			pos++;
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		previousNode.next = currentNode.next;
		currentNode.next.previous=previousNode;
		currentNode = null;
	}

	public void addNodeAtBeginning(T data) {
		if (data == null) {
			System.out.println("Data cant be null");
			return;
		}
		DLLNode<T> newNode = new DLLNode<T>(data);
		if (headNode == null) {
			headNode = newNode;
			return;
		}

		newNode.next = headNode;
		headNode.previous=newNode;
		headNode = newNode;
	}

	public void addNodeAtEnd(T data) {
		if (data == null) {
			System.out.println("Invalid Data");
			return;
		}
		DLLNode<T> newNode = new DLLNode<T>(data);
		currentNode = headNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		newNode.previous=currentNode;
	}

	public void addNodeAtMiddle(T data, int position) {
		int size = listSize();
		if (position < 1 || position > size+1) {
			System.out.println("Invalid Position:"+position);
			return;
		}
		if (position == 1) {
			addNodeAtBeginning(data);
			return;
		}
		DLLNode<T> newNode = new DLLNode<T>(data);
		int currentPos = 1;
		currentNode = headNode;
		while (currentNode.next != null && currentPos < position) {
			previousNode=currentNode;
			currentNode = currentNode.next;
			currentPos++;
		}
		newNode.previous=previousNode;
		newNode.next=currentNode;
		previousNode.next=newNode;
		currentNode.previous=newNode;
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
	public void displayInReverse() {
		currentNode = headNode;
		while (currentNode != null) {
			previousNode=currentNode;
			currentNode = currentNode.next;
		}
		
		while (previousNode != null) {
			System.out.println(previousNode.data);
			previousNode=previousNode.previous;
		}
		
	}
}
