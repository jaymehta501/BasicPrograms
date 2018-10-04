package graphs;

/**
 * O(E + VLogV) 1. Maintain two sets one
 * set will have veritices included in
 * Shortest path tree second set will
 * have vertices not included in set
 * 
 * At every step we find vertex which is
 * in other set and has minimum distance
 * from source
 * 
 * 1) Create a set sptSet (shortest path
 * tree set) that keeps track of
 * vertices included in shortest path
 * tree, i.e., whose minimum distance
 * from source is calculated and
 * finalized. Initially, this set is
 * empty. 2) Assign a distance value to
 * all vertices in the input graph.
 * Initialize all distance values as
 * INFINITE. Assign distance value as 0
 * for the source vertex so that it is
 * picked first. 3) While sptSet doesn’t
 * include all vertices ….a) Pick a
 * vertex u which is not there in
 * sptSetand has minimum distance value.
 * ….b) Include u to sptSet. …. c)
 * Update distance value of all adjacent
 * vertices of u. To update the distance
 * values, iterate through all adjacent
 * vertices. For every adjacent vertex
 * v, if sum of distance value of u
 * (from source) and weight of edge u-v,
 * is less than the distance value of v,
 * then update the distance value of v.
 * O(V^2) if we pick adjList instead of
 * matrix it will be O(E log V) with the
 * help of binary heap
 * 
 * 
 *
 */
public class ShortestPathDijkatsraAdjMatrix {

	int V = 9;

	// Dijkatsra
	void dijKstra(int graph[][], int src) {
		// Output array that will hold shortest distance from src to i
		int dist[] = new int[V];
		// Special Set sptSet[i] will hold true if vertex is included in shotest path tree or shortest distance is finalized
		Boolean sptSet[] = new Boolean[V];

		// Initialize all distance to finite value
		for (int i = 0; i < V; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		// Initialize Src vertex with 0
		dist[src] = 0;

		// Find Shortest Path for all vertices
		for (int count = 0; count < V - 1; count++) {
			// Pick the minimum distance vertex from set of vertices not yet processed
			int u = minimum(dist, sptSet);
			// Mark picked vertex as processed
			sptSet[u] = true;
			// Update dist value of the adjacent vertices of the
			// picked vertex.
			for (int v = 0; v < V; v++) {

				// Update dist[v] if sptSet is false and there is an edge between u&v
				// total weight from u to v is smaller than current value of dist[v]
					if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
						dist[v] = dist[u] + graph[u][v];
					}

				// Break loop if we need shortest distance from source to target
				/*
				 * if (u == graph[u][v])
				 * { break; }
				 */

			}

		}
		printSolution(dist, V);
	}

	private void printSolution(int[] dist, int v2) {
		System.out.println("Vertex   Distance from Source");
		for (int i = 0; i < V; i++)
			System.out.println(i + " \t\t " + dist[i]);

	}

	private int minimum(int[] dist, Boolean[] sptSet) {
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int v = 0; v < V; v++) {
			if (sptSet[v] == false && dist[v] < min) {
				min = dist[v];
				minIndex = v;
			}
		}
		return minIndex;
	}

	public static void main(String[] args) {
		/*
		 * Let us create the example
		 * graph discussed above
		 */
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		ShortestPathDijkatsraAdjMatrix spd = new ShortestPathDijkatsraAdjMatrix();
		spd.dijKstra(graph, 0);
	}

}
