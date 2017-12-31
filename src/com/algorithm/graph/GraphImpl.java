package com.algorithm.graph;

public class GraphImpl {

	public static void main(String[] args) {
		Graph g=new Graph();
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		System.out.println(g.isEdge(1, 3));
		System.out.println(g.isEdge(0, 3));
		
		g.displayVertex(2);
		g.displayVertex(1);
		g.displayVertex(4);
		
		System.out.println("Depth First Search");
		DepthFirstSearch d=new DepthFirstSearch();
		d.dfs(g);
		System.out.println("Breadth First Search");
		BreadthFirstSearch b=new BreadthFirstSearch();
		b.bfs(g);
		
		System.out.println("Unweighted Shortest Path");
		UnweightedShortestPath sp=new UnweightedShortestPath();
		int[] path=sp.getShortestPath(g, 0);
		
		for(int i:path)
			System.out.println(i);
		
		Graph g1=new Graph();
		g1.addVertex(0);
		g1.addVertex(1);
		g1.addVertex(2);
		g1.addVertex(3);
		g1.addVertex(4);
		g1.addVertex(5);
		g1.addEdge(0, 1, 3);
		g1.addEdge(0, 2, 4);
		g1.addEdge(1, 3, 5);
		g1.addEdge(1, 4, 6);
		g1.addEdge(1, 5, 7);
		
		System.out.println("BellMan Ford Algo");
		BellManFordAlgo bellManFordAlgo=new BellManFordAlgo();
		int[] path1=bellManFordAlgo.getShortestPath(g1, 0);
		for(int i:path1)
			System.out.println(i);
		

	}

}
