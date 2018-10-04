package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class AllPathsBetweenTwoNodesDFS {

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
		graph.addEdge(node2, node6);
		graph.addEdge(node3, node4);
		graph.addEdge(node5, node6);
		graph.addEdge(node1, node6);
		List<Node> allPathsNode = isDirectRoute(graph, node1, node6);
		for (Node nd : allPathsNode) {
			System.out.print(nd.getElement() + ",");
		}
	}

	// DFS
	public static List<Node> isDirectRoute(Graph graph, Node source, Node destination) {
		Stack<Node> stack = new Stack<Node>();
		List<Node> visited = new ArrayList<Node>();
		if (source != null) {
			stack.push(source);
		}
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			visited.add(node);
			System.out.println(node.getElement());
			for (Node neighbour : graph.getAdjList().get(node)) {
				if (!stack.contains(neighbour) && !visited.contains(neighbour)) {
					stack.push(neighbour);
				}

			}

		}
		return visited;
	}

}
