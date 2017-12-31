package com.ds.practice1.List;

public class CustomStackImpl {

	public static void main(String[] args) {
       CustomStack<Integer> stack=new CustomStack<>();
       stack.push(10);
       stack.push(20);
       stack.push(30);
       stack.push(40);
       stack.push(50);
       
       System.out.println("Stack Data");
       stack.display();
       
       stack.pop();
       stack.pop();
       
       System.out.println("Stack data After deleting 2 elements");
       stack.display();
       
       System.out.println("Top Eleemnt :"+stack.peek());
	}

}
