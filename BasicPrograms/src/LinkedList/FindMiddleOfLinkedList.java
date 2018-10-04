package LinkedList;

/**
 * O(N) Method 1 Traverse linked list
 * using two pointers. Move one pointer
 * by one and other pointer by two. When
 * the fast pointer reaches end slow
 * pointer will reach middle of the
 * linked list. O(N) Method 2 Initialize
 * mid element as head and initialize a
 * counter as 0. Traverse the list from
 * head, while traversing increment the
 * counter and change mid to mid->next
 * whenever the counter is odd. So the
 * mid will move only half of the total
 * length of the list.
 * 
 * 
 *
 */
public class FindMiddleOfLinkedList {
	Node head;

	void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The middle element is [" + slow_ptr.data + "] \n");
		}
	}

	void method2() {
		int count = 0;
		Node mid = head;
		while (head != null) {
			/*
			 * update mid, when 'count'
			 * is odd number
			 */
			if (count % 2 != 0) {
				mid = mid.next;
			}
			++count;
			head = head.next;
		}
		System.out.println(mid.data);
	}

	/*
	 * Inserts a new Node at front of
	 * the list.
	 */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node &
		 * Put in the data
		 */
		Node new_node = new Node(new_data);

		/*
		 * 3. Make next of new Node as
		 * head
		 */
		new_node.next = head;

		/*
		 * 4. Move the head to point to
		 * new Node
		 */
		head = new_node;
	}

	/*
	 * This function prints contents of
	 * linked list starting from the
	 * given node
	 */
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		FindMiddleOfLinkedList llist = new FindMiddleOfLinkedList();
		for (int i = 5; i > 0; --i) {
			llist.push(i);
			llist.printList();
		}
		System.out.println(Practice.middle(llist.head));
		llist.printMiddle();
		llist.method2();
	}
}
