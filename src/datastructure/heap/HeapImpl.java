package datastructure.heap;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

import datastructure.trees.BinaryTreeNode;

public class HeapImpl {

	/**
	 * @param args
	 */

	static Heap h = new Heap(7, 0);
	static int[] btArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root=createBinaryTree();
		createArrayFromBT(root);
		

		h.array = createHeapArray();
		h.count = 7;

		percolateDown(0);
		System.out.println("After Heapify");
		for (int i = 0; i < h.count; i++)
			System.out.println(h.array[i]);
		
		deleteMax();
		
		System.out.println("After deleting max element");
		for (int i = 0; i < h.count; i++)
			System.out.println(h.array[i]);
		
		insert(19);
		System.out.println("After inserting element");
		for (int i = 0; i < h.count; i++)
			System.out.println(h.array[i]);
		
		int b[]={1,4,5,2,3,9,6};
		buildHeap(b,7);
		System.out.println("After Building heap element");
		for (int i = 0; i < h.count; i++)
			System.out.println(h.array[i]);
		
		int c[]={6,3,4,1,9,11,15};
		heapSort(c,7);
		
		System.out.println("After heap sort");
		for (int i = 0; i < h.count; i++)
			System.out.println(h.array[i]);
	}

	public static int[] createHeapArray() {
		int a[] = { 17, 13, 19, 1, 4, 2, 5 };
		return a;
	}
	
	public static void createArrayFromBT(BinaryTreeNode root) {
		BinaryTreeNode temp;
		int i=0;
		Queue q = new LinkedBlockingDeque();
		q.add(root);
		while (!q.isEmpty()) {
			temp = (BinaryTreeNode) q.poll();
			System.out.println(temp.getData());
			btArray[i]=temp.getData();
			i++;

			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());
			}
		}

	}

	
	
	public static void heapSort(int A[],int n)
	{		
		int old_size,i,temp;
		buildHeap(A,n);
		old_size=h.count;
		for(i=n-1;i>=0;i--)
		{
			temp=h.array[0];
			h.array[0]=h.array[h.count-1];
			h.array[h.count-1]=temp;
			h.count--;
			percolateDown(0);
		}
		h.count=old_size;
	}
	
	public static void buildHeap(int A[],int n)
	{
		if(h==null)
			return;
		while(n>h.capacity)
			h.resizeHeap();
		
		for(int i=0;i<n;i++)
			h.array[i]=A[i];
		h.count=n;
		for(int i=(n-1)/2;i>=0;i--)
			percolateDown(i);
	}

	public static void deleteMax() {
		if (h.count > 0) {
			h.array[0] = h.array[h.count - 1];
			h.count--;
			percolateDown(0);
		}
	}
	
	public static void insert(int data)
	{
		int i;
		if(h.count==h.capacity)
			h.resizeHeap();
		h.count++;
		i=h.count-1;
		while(i>0 && data>h.array[(i-1)/2])
		{
			h.array[i]=h.array[(i-1)/2];
			i=(i-1)/2;
		}
		h.array[i]=data;
	}
	
	public static void createMaxHeap(int i) {
		int left, right, max, temp;
		left = h.leftChild(i);
		right = h.rightChild(i);
		if (left != -1 && h.array[left] > h.array[i])
			max = left;
		else
			max = i;
		if (right != -1 && h.array[right] > h.array[max])
			max = right;
		if (max != i) {
			temp = h.array[i];
			h.array[i] = h.array[max];
			h.array[max] = temp;
			percolateDown(max);
		}
	}

	public static void percolateDown(int i) {
		int left, right, max, temp;
		left = h.leftChild(i);
		right = h.rightChild(i);
		if (left != -1 && h.array[left] > h.array[i])
			max = left;
		else
			max = i;
		if (right != -1 && h.array[right] > h.array[max])
			max = right;
		if (max != i) {
			temp = h.array[i];
			h.array[i] = h.array[max];
			h.array[max] = temp;
			percolateDown(max);
		}
	}
	
	public static BinaryTreeNode createBinaryTree() {
		BinaryTreeNode node1 = new BinaryTreeNode(50);
		BinaryTreeNode node2 = new BinaryTreeNode(56);
		BinaryTreeNode node3 = new BinaryTreeNode(2);
		BinaryTreeNode node4 = new BinaryTreeNode(10);
		BinaryTreeNode node5 = new BinaryTreeNode(20);
		BinaryTreeNode node6 = new BinaryTreeNode(7);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		return node1;
	}
	
	

}
