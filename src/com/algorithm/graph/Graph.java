package com.algorithm.graph;

class Vertex<T> {
	T label;
	public boolean isVisited;

	public Vertex(T label) {
		this.label = label;
		this.isVisited = false;
	}

}

public class Graph {
	public Vertex<Integer>[] vertexList;
	private final int maxVertices = 10;
	public int vertexCount;
	public boolean[][] adjMatrix;
	public int[][] weight;;

	public Graph() {
		vertexList = new Vertex[maxVertices];
		vertexCount = 0;
		adjMatrix = new boolean[maxVertices][maxVertices];
		weight=new int[maxVertices][maxVertices];
		for (int i = 0; i < maxVertices; i++)
			for (int j = 0; j < maxVertices; j++)
				adjMatrix[i][j] = false;
	}

	public void addVertex(Integer lab) {
		vertexList[vertexCount++] = new Vertex<Integer>(lab);
	}

	public void addEdge(int i, int j) {
		addEdge(i,j,1);
	}
	public void addEdge(int i, int j,int w) {
		if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
			adjMatrix[i][j] = true;
			adjMatrix[j][i] = true;
			weight[i][j]=w;
		}
	}

	public void removeEdge(int i, int j) {
		if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
			adjMatrix[i][j] = false;
			adjMatrix[j][i] = false;
			weight[i][j]=0;
		}
	}

	public boolean isEdge(int i, int j) {
		if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
			return adjMatrix[i][j];
		} else {
			return false;
		}
	}

	public void displayVertex(int i) {
		if (i >= 0 && i < vertexCount) {
			System.out.println(vertexList[i].label);
		}else
		{
			System.out.println("Vertex not found");
		}
	}
	public int getAdjUnvisitedVertex(int v)
	{
		for(int j=0;j<vertexCount;j++)
		{
			if(adjMatrix[v][j]==true && vertexList[j].isVisited==false)
			{
				return j;
			}
		}
		return -1;
	}
}
