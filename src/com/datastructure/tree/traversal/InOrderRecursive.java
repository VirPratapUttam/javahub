package com.datastructure.tree.traversal;

import com.datastructure.tree.BinaryTree;

public class InOrderRecursive<T> {
	public void preorderRecursive(BinaryTree<T> root)
	{
		if(root!=null)
		{
			preorderRecursive(root.getLeft());
			System.out.println(root.getData());
			preorderRecursive(root.getRight());
		}
	}

}
