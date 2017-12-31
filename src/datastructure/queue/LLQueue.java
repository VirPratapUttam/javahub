package datastructure.queue;
class ListNode
{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
}

public class LLQueue {
	private ListNode frontNode;
	private ListNode rearNode;
	
	
	public LLQueue()
	{
		this.frontNode=null;
		this.rearNode=null;
	}
	
	
	
	public ListNode getFrontNode() {
		return frontNode;
	}



	public void setFrontNode(ListNode frontNode) {
		this.frontNode = frontNode;
	}



	public ListNode getRearNode() {
		return rearNode;
	}



	public void setRearNode(ListNode rearNode) {
		this.rearNode = rearNode;
	}



	public boolean isEmpty()
	{
		return (frontNode==null);
	}
	
	public  LLQueue createQueue()
	{
		return new LLQueue();
	}
	public  void enqueue(int data)
	{
		ListNode newNode=new ListNode(data);
		if(rearNode!=null)
		{
			rearNode.setNext(newNode);
		}
		rearNode=newNode;
		if(frontNode==null){
			frontNode=rearNode;
		}
	}
	public int dequeue()
	{
		int data=0;
		if(isEmpty())
		{
			System.out.println("Queue Empty");
		}else{
			data=frontNode.getData();
			frontNode=frontNode.getNext();
		}
		return data;
	}

}
