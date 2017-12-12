package com.datastructure.tree.traversal;

import com.datastructure.tree.BinaryTree;

public class BinaryTreeRecursiveTraversal<T> {
	public void preorderRecursive(BinaryTree<T> root)
	{
		if(root!=null)
		{
			System.out.println(root.getData());
			preorderRecursive(root.getLeft());
			preorderRecursive(root.getRight());
		}
	}
	public void inorderRecursive(BinaryTree<T> root)
	{
		if(root!=null)
		{
			preorderRecursive(root.getLeft());
			System.out.println(root.getData());
			preorderRecursive(root.getRight());
		}
	}
	public void postorderRecursive(BinaryTree<T> root)
	{
		if(root!=null)
		{
			preorderRecursive(root.getLeft());
			preorderRecursive(root.getRight());
			System.out.println(root.getData());
		}
	}

}
