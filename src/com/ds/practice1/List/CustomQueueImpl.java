package com.ds.practice1.List;

public class CustomQueueImpl {

	public static void main(String[] args) {
		CustomQueue<Integer> queue=new CustomQueue<>();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		System.out.println("Queue Elements");
		queue.display();
		
		queue.dequeu();
		queue.dequeu();
		
		System.out.println("Queue Elements after deleting the records");
		queue.display();
		
	}

}
