package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> left;
	private BinaryTree<T> right;

	public BinaryTree() {

	}

	public BinaryTree(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTree<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTree<T> left) {
		this.left = left;
	}

	public BinaryTree<T> getRight() {
		return right;
	}

	public void setRight(BinaryTree<T> right) {
		this.right = right;
	}

	public int sizeRecursive(BinaryTree<T> root) {
		if (root == null)
			return 0;
		return sizeRecursive(root.getLeft()) + 1 + sizeRecursive(root.getRight());
	}

	public int size(BinaryTree<T> root) {
		Queue<BinaryTree<T>> Q = new LinkedList<>();
		BinaryTree<T> temp;
		Q.add(root);
		int count = 0;
		while (!Q.isEmpty()) {
			temp = Q.poll();
			count++;
			if (temp.getLeft() != null)
				Q.add(temp.getLeft());
			if (temp.getRight() != null)
				Q.add(temp.getRight());
		}
		return count;
	}

	public BinaryTree<T> insert(BinaryTree<T> root, T data) {
		BinaryTree<T> newNode = new BinaryTree<>(data);
		BinaryTree<T> temp = null;
		if (root == null)
			return newNode;
		Queue<BinaryTree<T>> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() != null)
				q.add(temp.getLeft());
			else {
				temp.setLeft(newNode);
				q = null;
				return root;
			}
			if (temp.getRight() != null)
				q.add(temp.getRight());
			else {
				temp.setRight(newNode);
				q = null;
				return root;
			}
		}
		return root;
	}

	public void print(BinaryTree<T> root) {
		BinaryTree<T> temp;
		Queue<BinaryTree<T>> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			temp = Q.poll();
			System.out.println(temp.data);
			if (temp.getLeft() != null)
				Q.add(temp.getLeft());
			if (temp.getRight() != null)
				Q.add(temp.getRight());
		}
	}

	public boolean search(BinaryTree<Integer> root, int data) {
		Queue<BinaryTree<Integer>> Q = new LinkedList<>();
		BinaryTree<Integer> temp;
		if (root == null)
			return false;
		Q.add(root);
		while (!Q.isEmpty()) {
			temp = Q.poll();
			if (temp.getData() == data)
				return true;
			if (temp.getLeft() != null)
				Q.add(temp.getLeft());
			if (temp.getRight() != null)
				Q.add(temp.getRight());

		}
		return false;
	}

	public boolean searchRecursively(BinaryTree<Integer> root, int data) {
		boolean temp;
		if (root == null)
			return false;
		if (root.getData() == data) {
			return true;
		} else {
			temp = searchRecursively(root.getLeft(), data);
			if (temp) {
				return temp;
			} else
				return searchRecursively(root.getRight(), data);
		}
	}

	public BinaryTree<Integer> createBinaryTree1() {
		BinaryTree<Integer> root = new BinaryTree<Integer>(10);
		root.setLeft(new BinaryTree<Integer>(20));
		root.setRight(new BinaryTree<Integer>(30));
		root.getLeft().setLeft(new BinaryTree<Integer>(40));
		root.getLeft().setRight(new BinaryTree<Integer>(50));
		root.getRight().setLeft(new BinaryTree<Integer>(60));
		root.getRight().setRight(new BinaryTree<Integer>(70));
		return root;
	}

	public BinaryTree<Integer> createBinaryTree2() {
		BinaryTree<Integer> root = new BinaryTree<Integer>(1);
		root.setLeft(new BinaryTree<Integer>(2));
		root.setRight(new BinaryTree<Integer>(3));
		root.getLeft().setLeft(new BinaryTree<Integer>(4));
		root.getLeft().setRight(new BinaryTree<Integer>(5));
		root.getRight().setLeft(new BinaryTree<Integer>(6));
		root.getRight().setRight(new BinaryTree<Integer>(7));
		return root;
	}

	public void deleteTree(BinaryTree<T> root) {
		if (root == null)
			return;
		deleteTree(root.getLeft());
		deleteTree(root.getRight());
		root = null;
	}

	public int heightRecursive(BinaryTree<T> root) {
		int leftHeight, rightHeight;
		if (root == null)
			return 0;
		else {
			leftHeight = heightRecursive(root.getLeft());
			rightHeight = heightRecursive(root.getRight());
			if (leftHeight > rightHeight)
				return leftHeight + 1;
			else
				return rightHeight + 1;
		}

	}

	public int height(BinaryTree<T> root) {
		BinaryTree<T> temp;
		Queue<BinaryTree<T>> Q = new LinkedList<>();

		if (root == null)
			return 0;
		Q.add(root);
		Q.add(null);
		int level = 0;
		while (!Q.isEmpty()) {
			temp = Q.poll();
			if (temp == null) {
				if (!Q.isEmpty())
					Q.add(null);
				level++;
			} else {
				if (temp.getLeft() != null)
					Q.add(temp.getLeft());
				if (temp.getRight() != null)
					Q.add(temp.getRight());
			}
		}
		return level;
	}

	public BinaryTree<T> deepestNode(BinaryTree<T> root) {
		BinaryTree<T> temp=null;
		Queue<BinaryTree<T>> Q = new LinkedList<>();

		Q.add(root);
		while (!Q.isEmpty()) {
			temp = Q.poll();
			if (temp.getLeft() != null)
				Q.add(temp.getLeft());
			if (temp.getRight() != null)
				Q.add(temp.getRight());
		}
		return temp;
	}
	

}
