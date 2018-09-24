package LinkedList;

public class detectLoop {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		LinkedList.Node head = linkedList.head();
		linkedList.add(new LinkedList.Node("1"));
		linkedList.add(new LinkedList.Node("2"));
		linkedList.add(new LinkedList.Node("3"));
		linkedList.add(new LinkedList.Node("4"));
		linkedList.add(new LinkedList.Node("5"));
		linkedList.add(new LinkedList.Node("6"));
		linkedList.add(new LinkedList.Node("7"));
		linkedList.add(new LinkedList.Node("8"));
		linkedList.add(new LinkedList.Node("9"));
		linkedList.add(new LinkedList.Node("10"));		
		linkedList.add(new LinkedList.Node("11"));	
		
		detctLoopLinkedList(linkedList);
	}
	
	public static void detctLoopLinkedList(LinkedList list) {
		
		
	}	

}
