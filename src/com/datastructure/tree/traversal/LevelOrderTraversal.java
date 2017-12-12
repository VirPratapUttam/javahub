package com.datastructure.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

import com.datastructure.tree.BinaryTree;

public class LevelOrderTraversal<T> {
	
	public void levelOrder(BinaryTree<T> root)
	{
		BinaryTree<T> temp;
		Queue<BinaryTree<T>> Q=new LinkedList<>();
		Q.add(root);
		while(!Q.isEmpty())
		{
			temp=Q.poll();
			System.out.println(temp.getData());
			if(temp.getLeft()!=null)
				Q.add(temp.getLeft());
			if(temp.getRight()!=null)
				Q.add(temp.getRight());
		}
	}

}
