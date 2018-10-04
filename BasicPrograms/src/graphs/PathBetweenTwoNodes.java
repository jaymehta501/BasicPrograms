package graphs;

import java.util.LinkedList;

public class PathBetweenTwoNodes {

	public static void main(String[] args) {

		Node node1 = new Node(1, State.Unvisited);
		Node node2 = new Node(1, State.Unvisited);
		Node node3 = new Node(1, State.Unvisited);
		Node node4 = new Node(1, State.Unvisited);
		Node node5 = new Node(1, State.Unvisited);
		Node node6 = new Node(1, State.Unvisited);

		// Add nodes
		Graph graph = new Graph();
		graph.addNode(node1);
		graph.addNode(node2);
		graph.addNode(node3);
		graph.addNode(node4);
		graph.addNode(node5);
		graph.addNode(node6);

		graph.addEdge(node1, node2);
		graph.addEdge(node3, node4);
		graph.addEdge(node5, node6);
		graph.addEdge(node1, node6);
		boolean isPathExist = isDirectRoute(graph, node1, node2);
		System.out.println(isPathExist);

	}

	// BFS
	public static boolean isDirectRoute(Graph graph, Node source, Node destination) {
		LinkedList<Node> queue = new LinkedList<Node>();
		if (source != null) {
			source.setState(State.Visiting);
			queue.add(source);
		}
		Node queueElement;
		while (!queue.isEmpty()) {
			queueElement = (Node) queue.removeFirst();
			if (null != queueElement) {
				for (Node node : graph.getAdjList().get(queueElement)) {
					if (State.Unvisited == node.getState()) {
						if (node == destination) {
							return true;
						} else {
							node.setState(State.Visiting);
							queue.add(node);
						}
					}
				}
			}
			queueElement.setState(State.Visited);
		}
		return false;
	}

}
