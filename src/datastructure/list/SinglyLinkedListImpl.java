package datastructure.list;

class ListNode
{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.data = data;
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
public class SinglyLinkedListImpl {

	/**
	 * @param args
	 */
	static ListNode headNode=null;
	static ListNode currentNode=headNode;
	static ListNode previousNode=headNode;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNodeAtLast(10);
		addNodeAtLast(30);
		addNodeAtLast(40);
		addNodeAtLast(50);
		addNodeAtBeginning(4);
		addNodeInMiddle(5,2);
		addNodeInMiddle(7,1);
		addNodeInMiddle(9,-1);
		addNodeInMiddle(9,9);
		addNodeInMiddle(9,7);
		printNodes();
		deleteNodeAtLast();		
		System.out.println("After deleting node at last");
		printNodes();
		deleteNodeAtBeginning();
		System.out.println("After deleting node at beginning");
		printNodes();
		deleteNodeInMiddle(3);
		System.out.println("After deleting position node");
		printNodes();
		System.out.println("Size is :-"+sizeOfList(headNode));
	}
	public static void printNodes()
	{
		currentNode=headNode;
		while(currentNode!=null)
		{
			System.out.println(currentNode.getData());
			currentNode=currentNode.getNext();
		}
	}
	
	public static int sizeOfList(ListNode headNode)
	{
		currentNode=headNode;
		int length=0;
		while(currentNode!=null)
		{
			length++;
			currentNode=currentNode.getNext();
		}
		return length;		
	}
	
	public static void deleteNodeAtBeginning()
	{
		ListNode temp=headNode;
		headNode=headNode.getNext();
		temp=null;
	}
	
	public static void addNodeAtLast(int data)
	{
		ListNode newNode=new ListNode(data);
		if(headNode==null)
		{
			currentNode=headNode=newNode;
		}
		else
		{
		 currentNode.setNext(newNode);
		 currentNode=currentNode.getNext();
		}
	}
	
	public static void deleteNodeAtLast()
	{
		currentNode=headNode;
		while(currentNode.getNext().getNext()!=null)
		{
			currentNode=currentNode.getNext();
		}
		currentNode.setNext(null);
	}
	public static void addNodeAtBeginning(int data)
	{
		ListNode newNode=new ListNode(data);
		if(headNode==null)
		{
			currentNode=headNode=newNode;
		}
		else
		{
		 newNode.setNext(headNode);
		 headNode=newNode;
		}
	}
	public static void addNodeInMiddle(int data,int position)
	{
		int size=sizeOfList(headNode);
		System.out.println("Size : "+size);
		ListNode newNode=new ListNode(data);
		if(position<1 || position>size+1)
		{
			System.out.println("invalid position");
		}
		else if (position ==1)
		{
			addNodeAtBeginning(data);
		}
		
		else
		{
			previousNode=headNode;
			int pos=1;
			while(pos<position-1)
			{
				previousNode=previousNode.getNext();
				pos++;
			}
			currentNode=previousNode.getNext();
			newNode.setNext(currentNode);
			previousNode.setNext(newNode);
		}
	}
	
	public static void deleteNodeInMiddle(int position)
	{
		int size=sizeOfList(headNode);
		System.out.println("Size : "+size);
		if(position<1 || position>size+1)
		{
			System.out.println("invalid position");
		}
		else if (position ==1)
		{
			deleteNodeAtBeginning();
		}
		
		else
		{
			previousNode=headNode;
			int pos=1;
			while(pos<position-1)
			{
				previousNode=previousNode.getNext();
				pos++;
			}
			previousNode.setNext(previousNode.getNext().getNext());
		}
	}

}
