package datastructure.queue;

public class QueueWith2StackImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueWithTwoStack q=new QueueWithTwoStack();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		while(!q.isEmpty())
		{
			System.out.println(q.dequeue());
		}

	}

}
