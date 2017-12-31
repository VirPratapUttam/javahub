package com.algorithm.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BellManFordAlgo {
	Queue<Integer> q = new LinkedList<>();

	public int[] getShortestPath(Graph g, int s) {
		int[] distance = new int[g.vertexCount];
		int[] path = new int[g.vertexCount];
		for (int i = 0; i < g.vertexCount; i++)
			distance[i] = Integer.MAX_VALUE;

		distance[s] = 0;

		g.vertexList[0].isVisited = true;
		path[s] = 0;
		q.add(0);
		int v, w;
		while (!q.isEmpty()) {
			v = q.remove();
			while ((w = g.getAdjUnvisitedVertex(v)) != -1) {
				int d=distance[v]+g.weight[v][w];
				if (distance[w] > d) {
					g.vertexList[w].isVisited=true;
					distance[w] = d;
					path[w] = v;
					q.add(w);
				}
			}
		}
		q=null;
		return path;
	}

}
