package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ShortesPathDijkstraAdjList {
	public static void main(String[] args) {
		Node node1 = new Node(1, State.Unvisited, 1);
		Node node2 = new Node(1, State.Unvisited, 2);
		Node node3 = new Node(1, State.Unvisited, 3);
		Node node4 = new Node(1, State.Unvisited, 4);
		Node node5 = new Node(1, State.Unvisited, 5);
		Node node6 = new Node(1, State.Unvisited, 6);

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
		for (Node n : graph.getNodes()) {
			applyDijkstra(graph, n);
			break;
		}
	}

	// Compute Shortest path

	// apply dijkstra based upon BFS

	public static void applyDijkstra(Graph graph, Node sourceNode) {

		Queue<Node> queue = new PriorityQueue<Node>();
		if (sourceNode != null) {
			sourceNode.setWeight(0);
			sourceNode.setState(State.Visiting);
			queue.add(sourceNode);
		}
		List<Node> distanceTracker = new ArrayList<Node>();

		while (!queue.isEmpty()) {
			Node u = (Node) queue.remove();
			if (u != null) {
				for (Node neighbour : graph.getAdjList().get(u)) {
					if (neighbour.getState() == State.Unvisited) {
						neighbour.setState(State.Visiting);
						queue.add(neighbour);
					}
					// apply dijkstra algo logic
					if (neighbour.getState() != State.Visited && (neighbour.getWeight() > neighbour.getWeight() + u.getWeight())) {
						int neighbourWeight = neighbour.getWeight() + u.getWeight();
						neighbour.setWeight(neighbourWeight);
						distanceTracker.add(neighbour);
					}

				}

			}
			u.setState(State.Visited);
		}
		for (Node currNode : distanceTracker) {
			System.out.println(currNode.getWeight());
		}
	}
}
