package com.datastructure.tree;

import com.datastructure.tree.problems.LevelOrderReverse;
import com.datastructure.tree.problems.MaxMinOperation;

public class BinaryTreeImpl {

	public static void main(String[] args) {
		BinaryTree<Integer> bt1=new BinaryTree<>();
		bt1=bt1.createBinaryTree1();
		bt1.print(bt1);
		System.out.println("Size :-"+bt1.size(bt1));
		
		System.out.println("After Inserting 80");
		bt1=bt1.insert(bt1, 80);
		bt1.print(bt1);
		System.out.println("Size of :"+bt1.sizeRecursive(bt1));
		
		
		/*   Max Min Operation */
		
		MaxMinOperation operation=new MaxMinOperation();
		System.out.println("Max is :"+operation.findMax(bt1));
		System.out.println("Max is :"+operation.findMaxRecursive(bt1));
		System.out.println("Min is :"+operation.findMin(bt1));
		System.out.println("Min is :"+operation.findMinRecursive(bt1));
		
		System.out.println(bt1.searchRecursively(bt1, 20));
		System.out.println(bt1.searchRecursively(bt1, 100));
		

		System.out.println(bt1.search(bt1, 20));
		System.out.println(bt1.search(bt1, 100));
		
		System.out.println("Level Order Reverse");
	    new LevelOrderReverse().levelOrderReverse(bt1);
	    
	    System.out.println("Height of Tree : "+bt1.heightRecursive(bt1));
	    System.out.println("Height of Tree : "+bt1.height(bt1));
	    
	    System.out.println("Deepest Node:- "+bt1.deepestNode(bt1).getData());
	    
	    System.out.println("-------------------Leaves Count-------------------");
	    System.out.println("No of Leaves :-"+bt1.noOfLeaves(bt1));
	    System.out.println("No Of half Nodes :"+bt1.noOfHalfNodes(bt1));
	    System.out.println("No of Full Nodes :"+bt1.noOfFulllNodes(bt1));
		
	    
	    
	}

}
