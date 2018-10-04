package graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * We can use DFS(Find path between two
 * nodes) but with idea after
 * destination node is found by
 * dfs,print path and mark it unvisited
 * so that dfs could continue finding
 * all remaining paths.
 * 
 * 
 *
 */
public class AllPaths {

	static int dim = 5; // dim is number of nodes in graph

	//color is used to mark if the node is visited or not
	static boolean[] color = new boolean[dim + 1];

	//graph is given in 2-D matrix form
	static int[][] graph = new int[10][10];

	// this list will store nodes on the path from source to destination
	static List<Integer> list = new ArrayList<Integer>();

	// this is the size of "list" declared above
	// size is used to remember index of the node in the list to be removed
	// when  the node is marked unvisited
	static int size;

	public static void main(String[] args) {
		int src = 1;
		int dst = 5;
		dfs(src, dst); // backtracking
	}

	static void dfs(int src, int dst) {
		//node added to path
		list.add(src);
		size++;

		//node marked as visited
		color[src] = true;

		//when the destination node is found
		if (src == dst) {

			// Print the path
			for (Integer node : list) {
				System.out.print(node + "  ");
			}
			System.out.println();
			return;
		}

		for (int I = 1; I <= dim; I++) {
			// if there's an edge between  src and node
			if (graph[src][I] == 1) {

				//and that node is not visited yet
				if (color[I] == false) {

					//start dfs from that node
					dfs(I, dst);

					//This line is critical to understand
					//it marks the node unvisited which we have just visited
					//so that the dfs could find another path to destination
					color[I] = false;

					//size of list reduced by 1
					//as the node is marked unvisited
					//hence removed from the list
					size--;

					//remove that node at index "size" from list
					list.remove(size);
				}
			}
		}
	}
}
