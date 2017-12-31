package com.algorithm.graph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dijikstra {
	//TODO: Implement depend on Binary Min Heap
	PriorityQueue<Integer> pq = new PriorityQueue<>();

	public int[] getShortestPath(Graph g, int s) {
		int[] distance = new int[g.vertexCount];
		int[] path = new int[g.vertexCount];
		
		for (int i = 0; i < g.vertexCount; i++)
			distance[i] = -1;

		distance[s] = 0;

		g.vertexList[0].isVisited = true;
		path[s] = 0;
		pq.add(0);
		int v, w;
		while (!pq.isEmpty()) {
			v = pq.poll();
			while ((w = g.getAdjUnvisitedVertex(v)) != -1) {
				 int d=distance[v]+g.weight[v][w];
				if (distance[w] == -1) {
					g.vertexList[w].isVisited=true;
					distance[w] = d;
					path[w] = v;
					pq.add(w);
				}
				if(distance[w]>d)
				{
					distance[w]=d;
					//TODO : update priority queue
					//pq.update();
				}
			}
		}
		pq=null;
		return path;
	}

}
