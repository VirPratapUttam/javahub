package com.datastructure.tree.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.datastructure.tree.BinaryTree;

public class LevelOrderReverse<T> {
	
	public void levelOrderReverse(BinaryTree<T> root)
	{
		Queue<BinaryTree<T>> Q=new LinkedList<>();
		Stack<BinaryTree<T>> S=new Stack<>();
		BinaryTree<T> temp;
		Q.add(root);
		while(!Q.isEmpty())
		{
			temp=Q.poll();
			if(temp.getRight()!=null)
				Q.add(temp.getRight());
			if(temp.getLeft()!=null)
				Q.add(temp.getLeft());
			S.push(temp);
		}
		print(S);
	}
	
	public void print(Stack<BinaryTree<T>> s)
	{
		while(!s.isEmpty())
		{
			System.out.println(s.pop().getData());
		}
	}
}
