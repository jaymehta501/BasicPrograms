package trees;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstTraversal {

	/**
	 * InOrder Recursive Solution
	 * 
	 * @param args
	 */

	public static void inOrderTraverse(Node root) {
		if (root != null) {
			inOrderTraverse(root.getLeft());
			System.out.print(+root.getData() + " ");
			inOrderTraverse(root.getRight());
		}

	}

	/**
	 * PreOrder
	 * 
	 * @param args
	 */
	public static void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	/**
	 * Post Order
	 * 
	 * @param args
	 */
	public static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData() + " ");
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println("InOrder Traverse");
		DepthFirstTraversal.inOrderTraverse(root);
		System.out.println("");
		System.out.println("PreOrder Traverse");
		DepthFirstTraversal.preOrder(root);
		System.out.println("");
		System.out.println("PostOrder Traverse");
		DepthFirstTraversal.postOrder(root);
	}

}

class Node {

	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public int getData() {
		return data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
}
