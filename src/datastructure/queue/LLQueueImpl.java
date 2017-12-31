package datastructure.queue;

import java.util.Stack;

public class LLQueueImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLQueue q=createQueue();
		while(q.getFrontNode()!=null)
		{
			System.out.println(q.getFrontNode().getData());
			q.setFrontNode(q.getFrontNode().getNext());
		}
		LLQueue q1=createQueue();
		System.out.println("Reverse Queue");
		LLQueue revQueue=reverseQueue(q1);
		while(revQueue.getFrontNode()!=null)
		{
			System.out.println(revQueue.getFrontNode().getData());
			revQueue.setFrontNode(revQueue.getFrontNode().getNext());
		}
	}
	
	public static LLQueue createQueue()
	{
		LLQueue q1=new LLQueue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(4);
		q1.enqueue(2);
		q1.enqueue(15);
		return q1;
		
	}
	
	public static LLQueue reverseQueue(LLQueue queue)
	{
		Stack stack=new Stack();
		while(!queue.isEmpty())
			stack.push(queue.dequeue());
		while(!stack.isEmpty())
			queue.enqueue((int) stack.pop());
		return queue;
	}
}
