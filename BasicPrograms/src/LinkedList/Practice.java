package LinkedList;

import java.util.UUID;

public class Practice {

	// Nth TO last

	void printNthFromLast(Node head, int n) {
		Node p1 = head;
		Node p2 = head;

		while (n > 0 && p2.next != null) {
			if (p2 == null) {
				return;
			}
			p2 = p2.next;
			n--;
		}
		// Not After above loop p2 is at n-1, now move both pointers until p2 reaches end
		while (p2.next == null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		System.out.println(p1.data);

	}

	// Delete Alternate

	void deleteAlt(Node node) {
		if (node == null) {
			return;
		}
		if (node.next == null) {
			return;
		}
		if (node.next.next != null)
			node.next = node.next.next;
		deleteAlt(node.next);

	}

	// Delete Node at given Position
	static Node deleteNode(Node node, int position) {
		if (position == 0) {
			Node head;
			return head = node.next;
		}

		int counter = 0;
		Node temp = node;
		while (temp != null && counter < position - 1) {
			temp = temp.next;
			counter++;
		}

		return temp.next = temp.next.next;

	}

	// Reverse Linked List
	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		//get second node    
		ListNode second = head.next;
		//set first's next to be null
		head.next = null;

		ListNode rest = reverseList(second);
		second.next = head;

		return rest;
	}

	// Reverse Pairs
	public static Node reversePairs(Node node) {
		Node temp = node;
		while (temp != null && temp.next != null) {
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;

		}
		temp = node;
		return temp;
	}

	// Find Cycle
	public static Node findAndRemoveCycle(Node node) {
		Node slowPointer = node;
		Node fastPointer = node.next;
		while (fastPointer != null && fastPointer.next != null) {
			if (slowPointer == fastPointer) {
				return removeLoop(slowPointer, fastPointer, node);
			}
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;

		}
		return node;
	}

	private static Node removeLoop(Node slow, Node fast, Node node) {
		if (slow == fast) {
			slow = node;
			while (slow != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			/*
			 * since fast->next is the
			 * looping point
			 */
			fast.next = null; /*
								 * remove
								 * loop
								 */
		}

		return node;
	}

	// Find Middle
	public static int middle(Node node) {
		Node slow = node;
		Node fast = node;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	// Random Number picker
	public static int randomPick(Node node) {
		if (node == null) {
			return 0;
		}
		// Use a different seed value so that we don't get
		// same result each time we run this program
		Math.abs(UUID.randomUUID().getMostSignificantBits());
		int result = node.data;
		int n;
		Node curr = node;
		for (n = 2; curr != null; n++) {
			if (Math.random() % 2 == 0) {
				result = curr.data;
			}
			curr = curr.next;

		}
		return result;
	}

	//// Sorted Insertion
	public static Node sortedInsertion(Node headA, Node headB) {
		if (headA == null)
			return headB;
		if (headB == null)
			return headA;
		if (headA.data < headB.data) {
			headA.next = sortedInsertion(headA.next, headB);
			return headA;

		} else {
			headB.next = sortedInsertion(headA, headB.next);
			return headB;
		}

	}

}
