package LinkedList;

public class DeleteNodeGivenPointer {

	Node head;

	public void deleteNode(Node nodePointer) {
		Node temp = nodePointer.next;
		nodePointer.data = temp.data;
		nodePointer.next = temp.next;
		temp = null;
	}

	/*
	 * Given a reference to the head of a list and an int, inserts a new Node on
	 * the front of the list.
	 */
	public void push(int new_data) {
		/* 1. alloc the Node and put the data */
		Node new_Node = new Node(new_data);

		/* 2. Make next of new Node as head */
		new_Node.next = head;

		/* 3. Move the head to point to new Node */
		head = new_Node;
	}

	/*
	 * This function prints contents of linked list starting from the given Node
	 */
	public void printList() {
		Node tNode = head;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	public static void main(String[] args) {
		DeleteNodeGivenPointer llist = new DeleteNodeGivenPointer();
		/*
		 * Use push() to construct below list 1->12->1->4->1
		 */
		llist.push(1);
		llist.push(4);
		llist.push(1);
		llist.push(12);
		llist.push(1);
		System.out.println("Before deleting");
		llist.printList();

		/*
		 * I m deleting the head itself. You can check for more cases
		 */
		llist.deleteNode(llist.head);
		System.out.println("\nAfter Deleting");
		llist.printList();
	}

}
