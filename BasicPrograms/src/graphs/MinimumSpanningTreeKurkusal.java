package graphs;

import java.util.Arrays;

/**
 * O(ELogE + ELogV) The value of E can
 * be atmost O(V2), so O(LogV) are
 * O(LogE) same. Therefore, overall time
 * complexity is O(ElogE) or O(ElogV)
 * 
 * 
 * 
 *         1. Sort all the edges in
 *         non-decreasing order of their
 *         weight.
 * 
 *         2. Pick the smallest edge.
 *         (Use Find Union Algorithm to
 *         find cycle) Check if it forms
 *         a cycle with the spanning
 *         tree formed so far. If cycle
 *         is not formed, include this
 *         edge. Else, discard it.
 * 
 *         3. Repeat step#2 until there
 *         are (V-1) edges in the
 *         spanning tree.
 *
 */
public class MinimumSpanningTreeKurkusal {
	// Driver Program
	public static void main(String[] args) {

		/*
		 * Let us create following
		 * weighted graph 10 0--------1
		 * | \ | 6| 5\ |15 | \ |
		 * 2--------3 4
		 */
		int V = 4; // Number of vertices in graph
		int E = 5; // Number of edges in graph
		GraphK graph = new GraphK(V, E);

		// add edge 0-1
		graph.edge[0].src = 0;
		graph.edge[0].dest = 1;
		graph.edge[0].weight = 10;

		// add edge 0-2
		graph.edge[1].src = 0;
		graph.edge[1].dest = 2;
		graph.edge[1].weight = 6;

		// add edge 0-3
		graph.edge[2].src = 0;
		graph.edge[2].dest = 3;
		graph.edge[2].weight = 5;

		// add edge 1-3
		graph.edge[3].src = 1;
		graph.edge[3].dest = 3;
		graph.edge[3].weight = 15;

		// add edge 2-3
		graph.edge[4].src = 2;
		graph.edge[4].dest = 3;
		graph.edge[4].weight = 4;

		graph.KruskalMST();
	}
}

class GraphK {

	class EdgeK implements Comparable<EdgeK> {
		int src;
		int weight;
		int dest;

		@Override
		public int compareTo(EdgeK o) {
			return this.weight - o.weight;
		}

	};

	// Class to represent subset for union find
	class subset {
		int parent, rank;
	};

	int V, E; // no. of vertices and edges
	EdgeK edge[]; // Collection of edges

	GraphK(int v, int e) {
		this.V = v;
		this.E = e;
		edge = new EdgeK[E];
		for (int i = 0; i < e; i++) {
			edge[i] = new EdgeK();

		}
	}

	// Utility function to find set of an element i
	// (uses path compression technique)
	int find(subset subsets[], int i) {
		// find root and make root as parent of i (path compression)
		if (subsets[i].parent != i)
			subsets[i].parent = find(subsets, subsets[i].parent);
		return subsets[i].parent;
	}

	// A function that does union of two sets of x and y
	// (uses union by rank)
	void Union(subset subsets[], int x, int y) {
		int xroot = find(subsets, x);
		int yroot = find(subsets, y);

		// Attach smaller rank tree under root of high rank tree
		// (Union by Rank)
		if (subsets[xroot].rank < subsets[yroot].rank)
			subsets[xroot].parent = yroot;
		else if (subsets[xroot].rank > subsets[yroot].rank)
			subsets[yroot].parent = xroot;

		// If ranks are same, then make one as root and increment
		// its rank by one
		else {
			subsets[yroot].parent = xroot;
			subsets[xroot].rank++;
		}
	}

	// The main function to construct MST using Kruskal's algorithm
	void KruskalMST() {
		EdgeK result[] = new EdgeK[V]; // Tnis will store the resultant MST
		int e = 0; // An index variable, used for result[]
		int i = 0; // An index variable, used for sorted edges
		for (i = 0; i < V; ++i)
			result[i] = new EdgeK();

		// Step 1:  Sort all the edges in non-decreasing order of their
		// weight.  If we are not allowed to change the given graph, we
		// can create a copy of array of edges
		Arrays.sort(edge);

		// Allocate memory for creating V subsets
		subset subsets[] = new subset[V];
		for (i = 0; i < V; ++i)
			subsets[i] = new subset();

		// Create V subsets with single elements
		for (int v = 0; v < V; ++v) {
			subsets[v].parent = v;
			subsets[v].rank = 0;
		}

		i = 0; // Index used to pick next edge

		// Number of edges to be taken is equal to V-1
		while (e < V - 1) {
			// Step 2: Pick the smallest edge. And increment the index
			// for next iteration
			EdgeK next_edge = new EdgeK();
			next_edge = edge[i++];

			int x = find(subsets, next_edge.src);
			int y = find(subsets, next_edge.dest);

			// If including this edge does't cause cycle, include it
			// in result and increment the index of result for next edge
			if (x != y) {
				result[e++] = next_edge;
				Union(subsets, x, y);
			}
			// Else discard the next_edge
		}

		// print the contents of result[] to display the built MST
		System.out.println("Following are the edges in the constructed MST");
		for (i = 0; i < e; ++i)
			System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
	}

}
