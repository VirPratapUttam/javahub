package datastructure.list;

import java.util.Deque;

public class LLStack {

	/**
	 * @param args
	 */
	private static ListNode headNode = null;
	private static ListNode currentNode = headNode;

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		System.out.println("Is stack empty? " + isEmpty());
		pop();
		push(10);
		push(30);
		push(40);
		push(50);
		System.out.println("Is stack empty? " + isEmpty());
		display();
		pop();
		System.out.println("After Pop operation");
		display();
		peek();
		System.out.println("After Peek operation");
		display();
		System.out.println("Size is :-" + size(headNode));
	}

	private static boolean isEmpty() {
		return headNode == null;
	}

	public static void display() {
		currentNode = headNode;
		while (currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}

	public static int size(ListNode headNode) {
		currentNode = headNode;
		int length = 0;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

	public static void pop() {
		if (!isEmpty()) {
			currentNode = headNode;
			while (currentNode.getNext().getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(null);
		} else {
			System.out.println("No Element");
		}

	}

	public static void peek() {
		currentNode = headNode;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		System.out.println("Top:-" + currentNode.getData());

	}

	public static void push(int data) {
		ListNode newNode = new ListNode(data);
		if (headNode == null) {
			currentNode = headNode = newNode;
		} else {
			currentNode.setNext(newNode);
			currentNode = currentNode.getNext();
		}
	}

}
