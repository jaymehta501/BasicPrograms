package LinkedList;

public class RemoveDuplicatesSortedList {

	Node head;

	void removeDuplicate() {
		Node current = head;
		Node nextOfNext;
		if (head == null) {
			return;
		}
		while (current.next != null) {
			if (current.data == current.next.data) {
				nextOfNext = current.next.next;
				current.next = null;
				current.next = nextOfNext;
			} else {
				current = current.next;
			}
		}

	}

	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Function to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/* Drier program to test above functions */
	public static void main(String args[]) {
		RemoveDuplicatesSortedList llist = new RemoveDuplicatesSortedList();
		llist.push(20);
		llist.push(13);
		llist.push(13);
		llist.push(11);
		llist.push(11);
		llist.push(11);

		System.out.println("List before removal of duplicates");
		llist.printList();

		llist.removeDuplicate();
		System.out.println("List after removal of elements");
		llist.printList();
	}
}
