package datastructure.stack;

import java.util.Stack;

public class ModifiedAdvancedStack{
Stack elementStack=new Stack();
Stack minStack=new Stack();

public void push(int data)
{
	elementStack.push(data);
	if(minStack.isEmpty() || (int)minStack.peek() >(int)data)
	{
		minStack.push(data);
	}
}
public int getMinimum()
{
	return (int) minStack.peek();
}
public boolean isEmpty()
{
	return elementStack.isEmpty();
}

public int pop()
{
	if(elementStack.isEmpty())
		return 0;
	int minTop=(int) minStack.peek();
	int elementTop=(int) elementStack.peek();
	if(minTop==elementTop)
		minStack.pop();
	return (int) elementStack.pop();
}

public int top()
{
  return (int) elementStack.peek();
}

}
