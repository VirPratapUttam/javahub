package datastructure.stack;

import java.util.Stack;

class StackItem
{
	public StackItem(int height, int index) {
		// TODO Auto-generated constructor stub
		this.height=height;
		this.index=index;
	}
	public int height;
	public int index;
}

public class MaxRectangleAreaImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={3,2,6,7,6,1,4,4};
		System.out.println(maxRectangleArea(a,a.length));
	}
	
	public static long maxRectangleArea(int a[],int n)
	{
		long maxArea=0;
		if(a==null || a.length==0)
			return maxArea;
		Stack<StackItem> s=new Stack<StackItem>();
		s.push(new StackItem(Integer.MIN_VALUE,-1));
		for(int i=0;i<=n;i++)
		{
			StackItem cur=new StackItem((i<n?a[i]:Integer.MIN_VALUE),i);
			if(cur.height>s.peek().height)
			{
				s.push(cur);
				continue;
			}
			while(s.size()>1)
			{
				StackItem prev=s.peek();
				long area=(i-prev.index)*prev.height;
				if(area>maxArea)
				{
					maxArea=area;
				}
				prev.height=cur.height;
				if(prev.height>s.get(s.size()-2).height){
					break;
				}
				s.pop();
			}
		}
		return maxArea;
	}

}
