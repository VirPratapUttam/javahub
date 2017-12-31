package datastructure.list;
class DLLNode{
	private int data;
	private DLLNode previous;
	private DLLNode next;
	
	
	public DLLNode(int data) {
		this.data = data;
		this.previous = null;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DLLNode getPrevious() {
		return previous;
	}
	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}
	public DLLNode getNext() {
		return next;
	}
	public void setNext(DLLNode next) {
		this.next = next;
	}
	
}

public class DoublyLinkedListImpl {

	/**
	 * @param args
	 */
	private static DLLNode headNode=null;
	private static DLLNode previousNode=null;
	private static DLLNode currentNode=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertAtLast(1);
		insertAtLast(2);
		insertAtLast(3);
		insertAtLast(8);
		insertAtLast(5);
		display();
		System.out.println("Size of List :- "+sizeOfList());
		System.out.println("Inseting at Start");
		insertAtBeginning(6);
		insertAtBeginning(7);
		System.out.println("Size of List :- "+sizeOfList());
		display();
		insertAtMiddle(9,3);
		insertAtMiddle(10,2);
		insertAtMiddle(11,11);
		System.out.println("Size of List :- "+sizeOfList());
		display();
		deleteAtBeginning();
		deleteAtBeginning();
		System.out.println("Size of List :- "+sizeOfList());
		display();
		deleteAtLast();
		deleteAtLast();
		System.out.println("Size of List :- "+sizeOfList());
		display();
		deleteAtMiddle(3);
		deleteAtMiddle(2);
		System.out.println("Size of List :- "+sizeOfList());
		display();
	}
	
	private static void display()
	{
		currentNode=headNode;
		while(currentNode!=null)
		{
			System.out.println(currentNode.getData());
			currentNode=currentNode.getNext();
		}
	}
	private static int sizeOfList()
	{
		currentNode=headNode;
		int count=0;
		while(currentNode!=null)
		{
			count++;
			currentNode=currentNode.getNext();
		}
		return count;
	}
	private static void insertAtMiddle(int data,int position)
	{
		DLLNode newNode=new DLLNode(data);
		int size=sizeOfList();
		if(position<1 || position>size+1)
			System.out.println("Invalid psotion");
		else if (position ==1)
		{
			insertAtBeginning(data);
		}
		else
		{
			int pos=1;
			previousNode=headNode;
			while(pos<position-1)
			{
				previousNode=previousNode.getNext();
				pos++;
			}
			currentNode=previousNode.getNext();
			previousNode.setNext(newNode);
			newNode.setPrevious(previousNode);
			newNode.setNext(currentNode);
			currentNode.setPrevious(newNode);
		}
	}
	
	private static void insertAtBeginning(int data)
	{
		DLLNode newNode=new DLLNode(data);
		newNode.setNext(headNode);
		headNode.setPrevious(newNode);
		headNode=newNode;
	}
	private static void deleteAtMiddle(int position)
	{
		int size=sizeOfList();
		if(position<1 || position>size+1)
		{
			System.out.println("Invalid position");
		}
		else if(position==1)
		{
		   deleteAtBeginning();
		}
		else
		{
			previousNode=headNode;
			int count=1;
			while(count<position-1)
			{
				previousNode=previousNode.getNext();
				count++;
			}
			currentNode=previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode.getNext().setPrevious(previousNode);
		}
		
	}
	private static void deleteAtLast()
	{
		currentNode=headNode;
		while(currentNode.getNext().getNext()!=null)
		{
		  currentNode=currentNode.getNext();	
		}
		currentNode.setNext(null);
	}
	private static void deleteAtBeginning()
	{
		DLLNode temp=headNode;
		headNode=headNode.getNext();
		headNode.setPrevious(null);
		temp=null;
	}
	
	
	private static void insertAtLast(int data)
	{
		DLLNode newNode=new DLLNode(data);
		if(headNode==null){
			headNode=newNode;
		}
		else{
			currentNode=headNode;
			while(currentNode.getNext()!=null)
			{
				currentNode=currentNode.getNext();
			}
			currentNode.setNext(newNode);
			newNode.setPrevious(currentNode);
		}
	}

}
