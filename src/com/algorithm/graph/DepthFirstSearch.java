package com.algorithm.graph;

import java.util.Stack;

public class DepthFirstSearch {
	Stack<Integer> stack=new Stack<>();
	
	public void dfs(Graph g)
	{
		g.vertexList[0].isVisited=true;
		g.displayVertex(0);
		stack.push(0);
		int v;
		while(!stack.isEmpty())
		{
			v=g.getAdjUnvisitedVertex(stack.peek());
			if(v==-1)
			{
				stack.pop();
			}
			else
			{
				g.vertexList[v].isVisited=true;
				g.displayVertex(v);
				stack.push(v);
			}
		}
		for(int i=0;i<g.vertexCount;i++)
		{
			g.vertexList[i].isVisited=false;
		}
	}
	

}
