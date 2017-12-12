package com.datastructure.tree.traversal;

import com.datastructure.tree.BinaryTree;

public class PreOrderRecursive<T> {
	public void preorderRecursive(BinaryTree<T> root)
	{
		if(root!=null)
		{
			System.out.println(root.getData());
			preorderRecursive(root.getLeft());
			preorderRecursive(root.getRight());
		}
	}

}
