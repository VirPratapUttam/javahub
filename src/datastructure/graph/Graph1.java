package datastructure.graph;

import java.util.Queue;
import java.util.Stack;

public class Graph1{
	private final int maxVertices=20;
	private static Vertex1 vertexList[];
	private static int adjMatrix[][];
	private static int vertexCount;
	private Stack theStack;
	private Queue theQueue;
	public Graph1() {
		vertexList=new Vertex1[maxVertices];
		adjMatrix = new int[maxVertices][maxVertices];
		vertexCount = 0;
		for(int i=0;i<maxVertices;i++)
		{
			for(int j=0;j<maxVertices;j++)
			{
				adjMatrix[j][i]=0;
			}
		}
		theStack=new Stack();
	}
	public void addVertex(char lab)
	{
		vertexList[vertexCount++]=new Vertex1(lab);
	}
	public void addEdge(int start,int end)
	{
		adjMatrix[start][end]=1;
		adjMatrix[end][start]=1;
	}
	public void displayVertex(int v)
	{
		System.out.println(vertexList[v].getLabel());
	}
	public void dfs()
	{
		vertexList[0].setVisited(true);
		displayVertex(0);
		theStack.push(0);
		while(!theStack.isEmpty())
		{
			int v=getAdjUnvisitedVertex((int) theStack.peek());
			if(v==-1)
				theStack.pop();
			else
			{
				vertexList[v].setVisited(true);
				displayVertex(v);
				theStack.push(v);
			}
		}
		for(int j=0;j<vertexCount;j++)
			vertexList[j].setVisited(false);
	}
	public void bfs()
	{
		vertexList[0].setVisited(true);
		displayVertex(0);
		theQueue.add(0);
		int v2;
		while(!theQueue.isEmpty())
		{
			int v1=(int) theQueue.poll();
			while((v2=getAdjUnvisitedVertex(v1))!=-1)
			{
				vertexList[v2].setVisited(true);
				displayVertex(v2);
				theQueue.add(v2);
			}
		}
		for(int j=0;j<vertexCount;j++)
			vertexList[j].setVisited(false);
	}
	public static int getAdjUnvisitedVertex(int v)
	{
		for(int j=0;j<vertexCount;j++)
		{
			if(adjMatrix[v][j]==1 && vertexList[j].isVisited()==false)
				return j;
		}
		return -1;
	}
}
