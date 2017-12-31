package datastructure.list;

import java.util.HashMap;

public class FindNthNodeFromEnd {

	/**
	 * @param args
	 */
	
	static SinglyLinkedListImpl list=new SinglyLinkedListImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list.addNodeAtLast(10);
		list.addNodeAtLast(20);
		list.addNodeAtLast(30);
		list.addNodeAtLast(40);
		list.addNodeAtLast(50);
		list.addNodeAtLast(60);
		list.addNodeAtLast(70);
		list.addNodeAtLast(80);
		findNthNodeFromEnd(2);
		findNthNodeFromEnd(6);
		findNthNodeUsingHashTable(2);
		findNthNodeUsingHashTable(6);
		findNthNodeFromEndUsing2Pointer(2);
		findNthNodeFromEndUsing2Pointer(6);
		System.out.println(checkLoopInList());
		

	}
	/* Brute Force Algorithm */
	private static void findNthNodeFromEnd(int number)
	{
		int size=list.sizeOfList(list.headNode);
		int revCount=size-number+1;
		int count=1;
		list.currentNode=list.headNode;
		while(count<revCount)
		{
			list.currentNode=list.currentNode.getNext();
			count++;
		}
		System.out.println(number+" node from last:-"+list.currentNode.getData());
	}
	
	private static void findNthNodeUsingHashTable(int n)
	{
		HashMap<Integer,ListNode> positionMap=new HashMap<Integer,ListNode>();
		int count=0;
		list.currentNode=list.headNode;
		while(list.currentNode!=null)
		{
			positionMap.put(++count, list.currentNode);
			list.currentNode=list.currentNode.getNext();
		}
		System.out.println(n+" node from last:-"+positionMap.get((positionMap.size()-n)+1).getData());
	}
	
	private static void findNthNodeFromEndUsing2Pointer(int n)
	{
	  ListNode fstPointer,slowPointer;
	  fstPointer=slowPointer=list.headNode;
	  int count=1;
	  while(fstPointer!=null && count<=n)
	  {
		  fstPointer=fstPointer.getNext();
		  count++;
	  }
	  while(fstPointer!=null)
	  {
		  slowPointer=slowPointer.getNext();
		  fstPointer=fstPointer.getNext();
	  }
	  System.out.println(n+" node from last using 2 pointers :-"+slowPointer.getData());
	}
  private static int checkLoopInList()
  {
	  ListNode fstPointer,slowPointer;
	  slowPointer=fstPointer=list.headNode;
	  while(fstPointer!=null && slowPointer!=null)
	  {
		  fstPointer=fstPointer.getNext();
		  
		  if(fstPointer==slowPointer)
			  return 1;
		  if(fstPointer==null)
			  return 0;
		  fstPointer=fstPointer.getNext();
		  
		  if(slowPointer==fstPointer)
		  {
			  return 1;
		  }
		  slowPointer=slowPointer.getNext();
	  }
	  return 0;
  }
  
  private static int findBeginOfLoop()
  {
	  ListNode fstPointer,slowPointer;
	  slowPointer=fstPointer=list.headNode;
	  int loopExist=0;
	  while(fstPointer!=null && slowPointer!=null)
	  {
		  fstPointer=fstPointer.getNext();
		  
		  if(fstPointer==slowPointer)
		  {
			  loopExist=1;
			  break;
		  }
		  if(fstPointer==null)
			  loopExist=0;
		  fstPointer=fstPointer.getNext();
		  
		  if(slowPointer==fstPointer)
		  {
			  loopExist=1;
			  break;
		  }
		  slowPointer=slowPointer.getNext();
	  }
	  if(loopExist==1)
	  {
		  slowPointer=list.headNode;
		  while(slowPointer!=fstPointer)
		  {
			  fstPointer=fstPointer.getNext();
			  slowPointer=slowPointer.getNext();
		  }
		  System.out.println(slowPointer.getData());
	  }
	  return 0;
  }
  
  private static int findLoopLength()
  {
	  ListNode fstPointer,slowPointer;
	  slowPointer=fstPointer=list.headNode;
	  int loopExist=0;
	  int counter=0;
	  while(fstPointer!=null && slowPointer!=null)
	  {
		  fstPointer=fstPointer.getNext();
		  
		  if(fstPointer==slowPointer)
		  {
			  loopExist=1;
			  break;
		  }
		  if(fstPointer==null)
			  loopExist=0;
		  fstPointer=fstPointer.getNext();
		  
		  if(slowPointer==fstPointer)
		  {
			  loopExist=1;
			  break;
		  }
		  slowPointer=slowPointer.getNext();
	  }
	  if(loopExist==1)
	  {
		  slowPointer=fstPointer;
		  while(slowPointer!=fstPointer)
		  {
			  slowPointer=slowPointer.getNext();
			  counter++;
		  }
		  return counter;
	  }
	  return counter;
  }
}
