package datastructure.trees;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class BinaryTreeImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTreeNode root = createBT();
		System.out.println("Pre Order Traversal");
		preOrderUsingRecursion(root);
		System.out.println("Post Order Traversal");
		postOrderUsingRecursion(root);
		System.out.println("In Order Traversal");
		inOrderUsingRecursion(root);
		System.out.println("Pre Order Traversal");
		// preOrder(root);
		System.out.println("Level Order Traversal");
		levelOrder(root);
		findMax(root);
		int max = findMaxUsingRecursion(root);
		System.out.println("Max Element is :-" + max);
		BinaryTreeNode root2 = createBT2();
		minLevel(root2);
		System.out.println("Found? "+findInBTRecursion(root2,20));
		System.out.println("Found? "+findInBTRecursion(root2,9));
		System.out.println("Found? "+findInBTRecursion(root2,7));
		System.out.println("Found? "+findInBTRecursion(root2,2));
		System.out.println("Found? "+findInBTRecursion(root2,56));
		System.out.println("Found? "+findInBTRecursion(root2,50));
		System.out.println("--------------Level Order Searching-------------------------");
		System.out.println("Found? "+searchLevelOrder(root2,20));
		System.out.println("Found? "+searchLevelOrder(root2,9));
		System.out.println("Found? "+searchLevelOrder(root2,7));
		System.out.println("Found? "+searchLevelOrder(root2,2));
		System.out.println("Found? "+searchLevelOrder(root2,56));
		System.out.println("Found? "+searchLevelOrder(root2,50));
		
		root2=insertInBT(root2, 6);
		display(root2);
		findParent(root2, 6);
		findParent(root2, 50);
		findParent(root2, 56);
		findParent(root2, 2);
		findParent(root2, 10);
		findParent(root2, 20);
		findParent(root2, 7);
		
		System.out.println("size of Binary Tree :- "+sizeOfBinaryTree(root2));
		System.out.println("size of BT Level Order :- "+sizeOfBinaryTreeLevelOrder(root2));
		
	}
	public static void deleteBinaryTree(BinaryTreeNode root)
	{
		if(root==null)
			return;
		deleteBinaryTree(root.getLeft());
		deleteBinaryTree(root.getRight());
		root=null;
	}
	
	public static void display(BinaryTreeNode root)
	{
		Queue q=new LinkedBlockingDeque<>();
		BinaryTreeNode temp;
		q.add(root);
		while(!q.isEmpty())
		{
			temp=(BinaryTreeNode)q.poll();
			System.out.println(temp.getData());
			if(temp.getLeft()!=null)
			{
				q.add(temp.getLeft());
			}
			if(temp.getRight()!=null)
			{
				q.add(temp.getRight());
			}
		}
	}
	public static int sizeOfBinaryTreeLevelOrder(BinaryTreeNode root)
	{
		BinaryTreeNode temp;
		int count=0;
		Queue<BinaryTreeNode> q=new LinkedBlockingDeque<BinaryTreeNode>();
		q.add(root);
		while(!q.isEmpty())
		{
			temp=q.poll();
			count++;
			if(temp.getLeft()!=null)
				q.add(temp.getLeft());
			if(temp.getRight()!=null)
				q.add(temp.getRight());
		}
		return count;
	}
	
	public static  int sizeOfBinaryTree(BinaryTreeNode root)
	{
		if(root==null)
			return 0;
		else
			return sizeOfBinaryTree(root.getLeft())+1+sizeOfBinaryTree(root.getRight());
	}
	
	public static BinaryTreeNode insertInBT(BinaryTreeNode root,int data)
	{
		Queue q=new LinkedBlockingDeque<>();
		BinaryTreeNode temp;
		BinaryTreeNode newNode=new BinaryTreeNode(data);
		newNode.setLeft(null);
		newNode.setRight(null);
		if(root==null)
			root=newNode;
		q.add(root);
		while(!q.isEmpty())
		{
			temp=(BinaryTreeNode)q.poll();
			if(temp.getLeft()!=null)
			{
				q.add(temp.getLeft());
			}else
			{
				temp.setLeft(newNode);
				return root;
			}
			if(temp.getRight()!=null)
			{
				q.add(temp.getRight());
			}else
			{
				temp.setRight(newNode);
				return root;
			}
		}
		return root;
	}
	
	public static void findParent(BinaryTreeNode root,int data)
	{
		Queue q= new LinkedBlockingDeque<>();
		BinaryTreeNode temp;
		q.add(root);
		while(!q.isEmpty())
		{
			temp=(BinaryTreeNode)q.poll();
				
			if(temp.getLeft()!=null)
			{
				if(temp.getLeft().getData()==data)
				{
					System.out.println("Parent of "+data+" is "+temp.getData());
				}
				q.add(temp.getLeft());
			}
			if(temp.getRight()!=null)
			{
				if(temp.getRight().getData()==data)
				{
					System.out.println("Parent of "+data+" is "+temp.getData());
				}
				q.add(temp.getRight());
			}
		}
	}
	public static boolean searchLevelOrder(BinaryTreeNode root,int data)
	{
		BinaryTreeNode temp;
		Queue q=new LinkedBlockingDeque();
		q.add(root);
		while(!q.isEmpty())
		{
			temp=(BinaryTreeNode) q.poll();
			if(temp.getData()==data)
				return true;
			if(temp.getLeft()!=null)
				q.add(temp.getLeft());
			if(temp.getRight()!=null)
				q.add(temp.getRight());
		}
		return false;
	}

	public static boolean findInBTRecursion(BinaryTreeNode root, int data) {
		boolean temp;
		if (root == null)
			return false;
		else {
			if (data == root.getData())
				return true;
			else {
				temp = findInBTRecursion(root.getLeft(), data);
				if (temp == true)
					return temp;
				else
					return (findInBTRecursion(root.getRight(), data));
			}
		}
	//	return false;
	}

	public static void minLevel(BinaryTreeNode root) {
		BinaryTreeNode temp;
		int min = 0;
		int sum = 0;
		int level = 0;
		Queue q = new LinkedBlockingDeque();
		BinaryTreeNode nullNode = new BinaryTreeNode(-5);
		q.add(root);
		q.add(nullNode);
		min = root.getData();
		level++;
		while (!q.isEmpty()) {
			temp = (BinaryTreeNode) q.poll();
			System.out.println(temp.getData());

			if (temp.getData() == -5) {
				if (min > sum) {
					level++;
					min = sum;
				}
				sum = 0;
				if (!q.isEmpty())
					q.add(nullNode);
			} else {
				sum += temp.getData();

				if (temp.getLeft() != null) {
					q.add(temp.getLeft());
				}
				if (temp.getRight() != null) {
					q.add(temp.getRight());
				}
			}
		}
		System.out.println("Level is :-" + level);
	}

	public static void levelOrder(BinaryTreeNode root) {
		BinaryTreeNode temp;
		Queue q = new LinkedBlockingDeque();
		q.add(root);
		while (!q.isEmpty()) {
			temp = (BinaryTreeNode) q.poll();
			System.out.println(temp.getData());

			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());
			}
		}

	}

	public static int findMaxUsingRecursion(BinaryTreeNode root) {
		BinaryTreeNode temp;
		int max = Integer.MIN_VALUE;
		int root_val, left, right;
		if (root != null) {
			root_val = root.getData();
			left = findMaxUsingRecursion(root.getLeft());
			right = findMaxUsingRecursion(root.getRight());
			if (left > right)
				max = left;
			else
				max = right;

			if (max < root_val)
				max = root_val;
		}
		return max;
	}

	public static void findMax(BinaryTreeNode root) {
		BinaryTreeNode temp;
		int max = Integer.MIN_VALUE;
		Queue q = new LinkedBlockingDeque();
		q.add(root);
		while (!q.isEmpty()) {
			temp = (BinaryTreeNode) q.poll();
			if (max < temp.getData())
				max = temp.getData();

			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());
			}
		}
		System.out.println("Max Element is :-" + max);

	}

	public static void inOrder(BinaryTreeNode root) {
		Stack stack = new Stack();
		while (true) {
			while (root != null) {
				stack.push(root);
				root = root.getLeft();
			}
			if (!stack.isEmpty()) {
				root = (BinaryTreeNode) stack.pop();
				System.out.println(root.getData());
				root = root.getRight();
			}
		}
	}

	public static void inOrderUsingRecursion(BinaryTreeNode root) {
		if (root != null) {
			inOrderUsingRecursion(root.getLeft());
			System.out.println(root.getData());
			inOrderUsingRecursion(root.getRight());
		}
	}

	public static void preOrder(BinaryTreeNode root) {
		Stack stack = new Stack();
		while (true) {
			while (root != null) {
				System.out.println(root.getData());
				stack.push(root);
				root = root.getLeft();
			}
			if (!stack.isEmpty()) {
				root = (BinaryTreeNode) stack.pop();
				root = root.getRight();
			}
		}
	}

	public static void preOrderUsingRecursion(BinaryTreeNode root) {
		if (root != null) {
			System.out.println(root.getData());
			preOrderUsingRecursion(root.getLeft());
			preOrderUsingRecursion(root.getRight());
		}
	}

	public static void postOrderUsingRecursion(BinaryTreeNode root) {
		if (root != null) {
			postOrderUsingRecursion(root.getLeft());
			postOrderUsingRecursion(root.getRight());
			System.out.println(root.getData());
		}
	}

	public static BinaryTreeNode createBT() {
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		return node1;
	}

	public static BinaryTreeNode createBT2() {
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
