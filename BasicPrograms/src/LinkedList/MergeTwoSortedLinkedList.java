package LinkedList;

public class MergeTwoSortedLinkedList {

	/**
	 * With Recursion
	 * 
	 */
	static Node mergeSortedListRecursion(Node list1, Node list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}

		if (list1.data < list2.data) {
			list1.next = mergeSortedListRecursion(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeSortedListRecursion(list1, list2.next);
			return list2;
		}

	}

	/**
	 * We create extra nodes
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static Node mergeTwoLists(Node l1, Node l2) {
		Node head = new Node(0);
		Node p = head;

		while (l1 != null || l2 != null) {
			if (l1 != null && l2 != null) {
				if (l1.data < l2.data) {
					p.next = l1;
					l1 = l1.next;
				} else {
					p.next = l2;
					l2 = l2.next;
				}
				p = p.next;
			} else if (l1 == null) {
				p.next = l2;
				break;
			} else if (l2 == null) {
				p.next = l1;
				break;
			}
		}

		return head.next;
	}

	/* Druver program to test above function */
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(1);
		Node node5 = new Node(1);
		Node node6 = new Node(2);
		node1.next = node2;
		node2.next = node3;
		node4.next = node5;
		node5.next = node6;
		Node result = MergeTwoSortedLinkedList.mergeTwoLists(node1, node4);
		MergeTwoSortedLinkedList.printList(result);
		System.out.println("With Recursion ");
		Node node11 = new Node(1);
		Node node22 = new Node(2);
		Node node33 = new Node(3);
		Node node44 = new Node(1);
		Node node55 = new Node(1);
		Node node66 = new Node(2);
		node11.next = node22;
		node22.next = node33;
		node44.next = node55;
		node55.next = node66;
		Node result2 = MergeTwoSortedLinkedList.mergeSortedListRecursion(node11, node44);
		MergeTwoSortedLinkedList.printList(result2);
	}

	// Utility method to print a linked list
	static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
