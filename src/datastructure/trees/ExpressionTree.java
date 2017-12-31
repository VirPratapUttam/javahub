package datastructure.trees;

import java.util.Stack;
class Node
{
	public char charData;
	public Node left;
	public Node right;
	
	
	public Node(char charData) {
		this.charData = charData;
	}
	public char getCharData() {
		return charData;
	}
	public void setCharData(char charData) {
		this.charData = charData;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}

public class ExpressionTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String postfix="ab+ef*g*-";
		Node root=buildExpressionTree(postfix.toCharArray(),postfix.length());
		System.out.println(root.getCharData());
	}
	
	public static Node buildExpressionTree(char[] postfix,int size)
	{
		Stack<Node> s=new Stack<Node>();
		for(int i=0;i<size;i++)
		{
			if(!isOperator(postfix[i]))
			{
				Node newNode=new Node(postfix[i]);
				s.push(newNode);
			}else
			{
				Node t2=s.pop(),t1=s.pop();
				Node newNode=new Node(postfix[i]);
				newNode.setLeft(t1);
				newNode.setRight(t2);
				s.push(newNode);
			}
		}
		return s.peek();
	}
	
	 public  static boolean isOperator(char c) {
	        if (c == '+' || c == '-'
	                || c == '*' || c == '/'
	                || c == '^') {
	            return true;
	        }
	        return false;
	    }

}
