package LinkedList;

/**
 * This method takes O(n) time and O(1)
 * extra space. 1) Get the middle of the
 * linked list. 2) Reverse the second
 * half of the linked list. 3) Check if
 * the first half and second half are
 * identical. 4) Construct the original
 * linked list by reversing the second
 * half again and attaching it back to
 * the first half
 * 
 * 
 *
 */
public class PalindromeLinkedList {
	Node head;
	Node slowPointer;
	Node fastPointer;
	Node secondHalf;

	boolean isPalindrome(Node head) {
		slowPointer = head;
		fastPointer = head;
		Node prevSlowPointer = head;
		Node midNode = null; // TO handle Odd Size
		boolean res = true;
		if (head != null && head.next != null) {
			while (fastPointer != null && fastPointer.next != null) {
				fastPointer = fastPointer.next.next;
				prevSlowPointer = slowPointer;
				slowPointer = slowPointer.next;
			}
			// fast pointer would become null in case of even nodes in case of odd nodes save middle node some where else
			if (fastPointer != null) {
				midNode = slowPointer;
				slowPointer = slowPointer.next;
			}
			// Reverse Second Half
			secondHalf = slowPointer;
			prevSlowPointer.next = null;
			// Reverse Second Half
			reverse();
			res = compareLists(head, secondHalf); // compare
			if (midNode != null) {
				// If there was a mid node (odd size case) which                                                         
				// was not part of either first half or second half.
				prevSlowPointer.next = midNode;
				midNode.next = secondHalf;
			} else
				prevSlowPointer.next = secondHalf;
		}
		return res;
	}

	/*
	 * Function to reverse the linked
	 * list Note that this function may
	 * change the head
	 */
	void reverse() {
		Node prevNode = null;
		Node current = secondHalf;
		Node nextNode = null;
		while (current != null) {
			nextNode = current.next;
			current.next = prevNode;
			prevNode = current;
			current = nextNode;
		}
		secondHalf = prevNode;
	}

	/*
	 * Function to check if two input
	 * lists have same data
	 */
	boolean compareLists(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;

		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else
				return false;
		}

		/* Both are empty reurn 1 */
		if (temp1 == null && temp2 == null)
			return true;

		/*
		 * Will reach here when one is
		 * NULL and other is not
		 */
		return false;
	}

	/*
	 * Push a node to linked list. Note
	 * that this function changes the
	 * head
	 */
	public void push(char new_data) {
		/*
		 * Allocate the Node & Put in
		 * the data
		 */
		Node new_node = new Node(new_data);

		/*
		 * link the old list off the new
		 * one
		 */
		new_node.next = head;

		/*
		 * Move the head to point to new
		 * Node
		 */
		head = new_node;
	}

	// A utility function to print a given linked list
	void printList(Node ptr) {
		while (ptr != null) {
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}

	/*
	 * Driver program to test the above
	 * functions
	 */
	public static void main(String[] args) {
		/* Start with the empty list */
		PalindromeLinkedList llist = new PalindromeLinkedList();
		char str[] = { 'a', 'b', 'a', 'c', 'a', 'b', 'a' };
		String string = new String(str);
		for (int i = 0; i < 7; i++) {
			llist.push(str[i]);
			llist.printList(llist.head);
			if (llist.isPalindrome(llist.head) != false) {
				System.out.println("Is Palindrome");
				System.out.println("");
			} else {
				System.out.println("Not Palindrome");
				System.out.println("");
			}
		}
	}

}
