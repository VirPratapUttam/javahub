package com.datastructure.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

import com.datastructure.tree.BinaryTree;

public class MaxMinOperation {
	
	public int findMaxRecursive(BinaryTree<Integer> root)
	{
		int root_val,left,right,max=Integer.MIN_VALUE;
			if(root!=null)
			{
				root_val=(int) root.getData();
				left=findMaxRecursive(root.getLeft());
				right=findMaxRecursive(root.getRight());
				if(left>right)
					max=left;
				else 
					max=right;
				
				if(root_val>max)
					max=root_val;
				
			}
			return max;
	}
	public int findMax(BinaryTree<Integer> root)
	{
		Queue<BinaryTree<Integer>> Q=new LinkedList<>();
		BinaryTree<Integer> temp;
		Q.add(root);
		int max=Integer.MIN_VALUE;
		while(!Q.isEmpty())
		{
			temp=Q.poll();
			if(temp.getData()>max)
				max=temp.getData();
			if(temp.getLeft()!=null)
				Q.add(temp.getLeft());
			if(temp.getRight()!=null)
				Q.add(temp.getRight());
			
		}
		return max;
	}
	
	
	public int findMinRecursive(BinaryTree<Integer> root)
	{
		int root_val,left,right,min=Integer.MAX_VALUE;
			if(root!=null)
			{
				root_val=(int) root.getData();
				left=findMinRecursive(root.getLeft());
				right=findMinRecursive(root.getRight());
				if(left<right)
					min=left;
				else 
					min=right;
				
				if(root_val<min)
					min=root_val;
				
			}
			return min;
	}
	public int findMin(BinaryTree<Integer> root)
	{
		Queue<BinaryTree<Integer>> Q=new LinkedList<>();
		BinaryTree<Integer> temp;
		Q.add(root);
		int min=Integer.MAX_VALUE;
		while(!Q.isEmpty())
		{
			temp=Q.poll();
			if(temp.getData()<min)
				min=temp.getData();
			if(temp.getLeft()!=null)
				Q.add(temp.getLeft());
			if(temp.getRight()!=null)
				Q.add(temp.getRight());
			
		}
		return min;
	}

}
