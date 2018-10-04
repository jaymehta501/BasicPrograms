package LinkedList;

class NodeAtTail {
	int data;
	NodeAtTail next;

	public NodeAtTail(int data) {
		this.data = data;
	}

}

public class InsertNodeAtTail {
	public static void main(String[] args) {
		NodeAtTail node1 = new NodeAtTail(1);
		NodeAtTail node2 = new NodeAtTail(2);
		node1.next = node2;

		InsertNodeAtTail tail = new InsertNodeAtTail();
		NodeAtTail head = tail.insertAtTail(node1, 3);

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public NodeAtTail insertAtTail(NodeAtTail head, int data) {
		NodeAtTail current = head;
		NodeAtTail newNode = new NodeAtTail(data);
		if (head == null) {
			head = newNode;
			return head;
		}

		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return head;

	}

}
