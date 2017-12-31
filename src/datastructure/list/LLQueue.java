package datastructure.list;

public class LLQueue {

	/**
	 * @param args
	 */
	private static ListNode headNode = null;
	private static ListNode currentNode = headNode;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is queue empty? " + isEmpty());
		dequeue();
		enqueue(10);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		display();
		dequeue();
		System.out.println("After dequeue operation");
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

	public static void dequeue() {
		if (!isEmpty())
			headNode = headNode.getNext();
		else
			System.out.println("Queue is Empty");
	}

	public static void peek() {
		System.out.println("Top:-" + headNode.getData());

	}

	public static void enqueue(int data) {
		ListNode newNode = new ListNode(data);
		if (headNode == null) {
			currentNode = headNode = newNode;
		} else {
			currentNode.setNext(newNode);
			currentNode = currentNode.getNext();
		}
	}

}
