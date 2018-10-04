package graphs;

/**
 * Prims Algorithm
 * 
 * 1) Create a set mstSet that keeps
 * track of vertices already included in
 * MST. 2) Assign a key value to all
 * vertices in the input graph.
 * Initialize all key values as
 * INFINITE. Assign key value as 0 for
 * the first vertex so that it is picked
 * first. 3) While mstSet doesn’t
 * include all vertices ….a) Pick a
 * vertex u which is not there in mstSet
 * and has minimum key value. ….b)
 * Include u to mstSet. ….c) Update key
 * value of all adjacent vertices of u.
 * To update the key values, iterate
 * through all adjacent vertices. For
 * every adjacent vertex v, if weight of
 * edge u-v is less than the previous
 * key value of v, update the key value
 * as weight of u-v
 * 
 * 
 *
 */
public class MinimumSpanningTreePrim {

	// Number of Vertices in graph
	private static final int V = 5;

	// Function to find vertex with minimum key value and from set of vertices not included in MST

	int minKey(int key[], Boolean mstSet[]) {
		int min = Integer.MAX_VALUE, minIndex = -1;
		for (int v = 0; v < V; v++) {
			if (mstSet[v] == false && key[v] < min) {
				min = key[v];
				minIndex = v;
			}
		}
		return minIndex;
	}

	// Construct MST
	void primMST(int graph[][]) {

		// Array to Store MST
		int parent[] = new int[V];

		// Key values used to pick minimum weight edge in cut
		int key[] = new int[V];

		// Set of vertices not yet included in MST
		Boolean mstSet[] = new Boolean[V];
		// Initialize all keys as INFINITE
		for (int i = 0; i < V; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}

		// Always include first vertex in MST mark first vertex to zero so it should be picked first
		key[0] = 0;
		// First node is always root
		parent[0] = -1;

		// The MST will have V vertices

		for (int count = 0; count < V - 1; count++) {
			// pick the minimum
			int u = minKey(key, mstSet);
			// Add picked vertex to MST
			mstSet[u] = true;
			// Update key value and parent index of the adjacent
			// vertices of the picked vertex. Consider only those
			// vertices which are not yet included in MST
			for (int v = 0; v < V; v++) {
				// graph[u][v] is non zero only for adjacent vertices of m
				// mstSet[v] is false for vertices not yet included in MST
				// Update the key only if graph[u][v] is smaller than key[v]
				if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
					parent[v] = u;
					key[v] = graph[u][v];
				}
			}
		}
		// print the constructed MST
		printMST(parent, V, graph);
	}

	public static void main(String[] args) {
		/*
		 * Let us create the following
		 * graph 2 3 (0)--(1)--(2) | / \
		 * | 6| 8/ \5 |7 | / \ |
		 * (3)-------(4) 9
		 */
		MinimumSpanningTreePrim t = new MinimumSpanningTreePrim();
		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, { 2, 0, 3, 8, 5 }, { 0, 3, 0, 0, 7 }, { 6, 8, 0, 0, 9 }, { 0, 5, 7, 9, 0 }, };

		// Print the solution
		t.primMST(graph);
	}

	// A utility function to print the constructed MST stored in
	// parent[]
	void printMST(int parent[], int n, int graph[][]) {
		System.out.println("Edge   Weight");
		for (int i = 1; i < V; i++)
			System.out.println(parent[i] + " - " + i + "    " + graph[i][parent[i]]);
	}
}
