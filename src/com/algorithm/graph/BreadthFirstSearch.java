package com.algorithm.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	Queue<Integer> q=new LinkedList<>();
	
	public void bfs(Graph g)
	{
		g.vertexList[0].isVisited=true;
		g.displayVertex(0);
		q.add(0);
		int v,w;
		while(!q.isEmpty())
		{
			v=q.remove();
			while((w=g.getAdjUnvisitedVertex(v))!=-1)
			{
				g.vertexList[w].isVisited=true;
				g.displayVertex(w);
				q.add(w);
			}
		}
		for(int i=0;i<g.vertexCount;i++)
		{
			g.vertexList[i].isVisited=false;
		}
	}
	

}
