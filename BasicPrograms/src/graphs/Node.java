package graphs;

public class Node {

	private int element;

	private State state;

	// Optional In case want to create weighted node
	private int weight;

	public Node(int element, State state) {
		this.element = element;
		this.state = state;
	}

	public Node(int element, State state, int weight) {
		this.element = element;
		this.state = state;
		this.weight = weight;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
