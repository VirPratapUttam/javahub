package com.datastructure.tree.traversal;

import com.datastructure.tree.BinaryTree;

public class PostOrderRecursive<T> {
	public void preorderRecursive(BinaryTree<T> root)
	{
		if(root!=null)
		{
			preorderRecursive(root.getLeft());
			preorderRecursive(root.getRight());
			System.out.println(root.getData());
		}
	}

}
