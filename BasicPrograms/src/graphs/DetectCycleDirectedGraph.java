package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Depth First Traversal can be used to
 * detect cycle in a Graph. DFS for a
 * connected graph produces a tree.
 * There is a cycle in a graph only if
 * there is a back edge present in the
 * graph. A back edge is an edge that is
 * from a node to itself (selfloop) or
 * one of its ancestor in the tree
 * produced by DFS
 * 
 * To detect a back edge, we can keep
 * track of vertices currently in
 * recursion stack of function for DFS
 * traversal. If we reach a vertex that
 * is already in the recursion stack,
 * then there is a cycle in the tree.
 * The edge that connects current vertex
 * to the vertex in the recursion stack
 * is back edge. We have used recStack[]
 * array to keep track of vertices in
 * the recursion stack.
 * 
 * 
 *
 */
public class DetectCycleDirectedGraph {
	public static void main(String[] args) {
		Node node1 = new Node(1, State.Unvisited);
		Node node2 = new Node(2, State.Unvisited);
		Node node3 = new Node(3, State.Unvisited);
		Node node4 = new Node(4, State.Unvisited);
		Node node5 = new Node(5, State.Unvisited);
		Node node6 = new Node(6, State.Unvisited);

		// Add nodes
		Graph graph = new Graph();
		graph.addNode(node1);
		graph.addNode(node2);
		graph.addNode(node3);
		graph.addNode(node4);
		graph.addNode(node5);
		graph.addNode(node6);

		graph.addEdge(node1, node2);
		graph.addEdge(node2, node3);
		graph.addEdge(node3, node4);
		graph.addEdge(node4, node5);
		graph.addEdge(node5, node6);
		graph.addEdge(node1, node1);
		System.out.println(isCycleExist(graph, node1));
	}

	public static boolean isCycleExist(Graph g, Node source) {
		Stack<Node> stack = new Stack<Node>();
		if (source != null) {
			stack.push(source);
		}
		List<Node> visited = new ArrayList<Node>();
		while (!stack.isEmpty()) {
			Node node = (Node) stack.pop();
			for (Node neighbour : g.getAdjList().get(node)) {
				if (visited.contains(neighbour)) {
					return true;
				}
				if (!stack.contains(neighbour)) {
					stack.push(neighbour);
					visited.add(neighbour);
				}
			}

		}

		return false;
	}

}
