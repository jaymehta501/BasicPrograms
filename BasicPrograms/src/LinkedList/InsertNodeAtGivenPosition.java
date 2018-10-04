package LinkedList;

class NodeElement {
	int data;
	NodeElement next;

	public NodeElement(int data) {
		this.data = data;
	}

}

public class InsertNodeAtGivenPosition {

	public static void main(String[] args) {
		InsertNodeAtGivenPosition in = new InsertNodeAtGivenPosition();
		NodeElement head = new NodeElement(1);
		NodeElement nodeElement2 = new NodeElement(2);
		NodeElement nodeElement3 = new NodeElement(3);
		NodeElement nodeElement4 = new NodeElement(4);
		NodeElement nodeElement5 = new NodeElement(5);
		head.next = nodeElement2;
		nodeElement2.next = nodeElement3;
		nodeElement3.next = nodeElement4;
		nodeElement4.next = nodeElement5;
		NodeElement result = in.InsertNth(head, 6, 3);
		while (result != null) {
			System.out.println(result.data + " ");
			result = result.next;
		}

	}

	NodeElement InsertNth(NodeElement head, int data, int position) {
		NodeElement trackedNode = head;
		NodeElement nodeToInsert = new NodeElement(6);
		if (head == null)
			return nodeToInsert;
		if (position == 0) {
			nodeToInsert.next = head;
			return nodeToInsert;
		}
		int countPosition = 0;

		while (countPosition < position - 1 && null != head.next) {
			head = head.next;
			countPosition++;
		}
		NodeElement nodeAtPosition = head.next;
		head.next = nodeToInsert;
		nodeToInsert.next = nodeAtPosition;
		return trackedNode;
	}

}
