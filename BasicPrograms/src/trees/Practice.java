package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import Misc.linkedlist.Node;

public class Practice {

	// Convert Linked List for each level of tree
	public static Node convertToLinkedList(TreeNode root) {
		if (root == null) {
			return null;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int levelNodes = 0;
		Node head = null;
		Node curr = null;
		while (!q.isEmpty()) {
			levelNodes = q.size();
			while (levelNodes > 0) {
				TreeNode currTreeNode = q.remove();
				Node listNode = new Node(currTreeNode.key);
				if (head == null) {
					head = listNode;
					curr = listNode;
				} else {
					curr.setNext(listNode);
					curr = curr.getNext();
				}
				if (currTreeNode.left != null) {
					q.add(currTreeNode.left);
				}
				if (currTreeNode.right != null) {
					q.add(currTreeNode.right);
				}
				levelNodes--;
			}

		}
		return head;

	}

	//Diameter
	static public int diameter(TreeNode root, Height height) {
		if (root == null) {
			height.h = 0;
			return 0;
		}
		Height lh = new Height();
		Height rh = new Height();
		lh.h++;
		rh.h++;
		int leftDiameter = diameter(root.left, lh);
		int rightDiameter = diameter(root.right, rh);
		height.h = Math.max(lh.h, rh.h) + 1;
		return Math.max((lh.h + rh.h + 1), Math.max(leftDiameter, rightDiameter));
	}
	// Find an Interval Overlap. Implement Interval Tree
	//https://github.com/masonmlai/interval-tree/blob/master/src/datastructures/IntervalTree.java

	// Traverse ZigZag
	public static void printZigZag(TreeNode root) {
		boolean revertOrder = false;
		int height = height(root);
		int i = 1;
		while (i <= height) {
			printGivenLevel(root, i, revertOrder);
			i++;
			revertOrder = !revertOrder;
		}

	}

	private static void printGivenLevel(TreeNode root, int level, boolean revertOrder) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.key + " ");
		} else if (level > 1) {
			if (revertOrder != false) {
				printGivenLevel(root.left, level - 1, revertOrder);
				printGivenLevel(root.right, level - 1, revertOrder);
			} else {
				printGivenLevel(root.right, level - 1, revertOrder);
				printGivenLevel(root.left, level - 1, revertOrder);
			}
		}
	}

	static private int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int height = Math.max(leftHeight, rightHeight) + 1;
		return height;
	}

	// Is Complete BT
	public static boolean isCompleteBinaryTree(TreeNode root) {
		if (root == null) {
			return true;
		}
		boolean bothChildNotSeen = false;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode current = q.remove();
			// if both child null
			if ((current.left == null) && (current.right == null)) {
				if (bothChildNotSeen)
					return false;
			}
			// if both not null
			if ((current.left != null) && (current.right != null)) {
				if (bothChildNotSeen) {
					return false;
				}
				q.add(current.left);
				q.add(current.right);
			}
			// If right is null
			if ((current.left != null) && (current.right == null)) {
				if (bothChildNotSeen) {
					return false;
				}
				bothChildNotSeen = true;
				q.add(current.left);
			}
			// If left is null
			if ((current.left == null) && (current.right != null)) {
				if (bothChildNotSeen) {
					return false;
				}
				bothChildNotSeen = true;
				q.add(current.right);

			}
		}
		return true;
	}

	// LCA --> Lowest Common Ancenstor
	public static int lowestCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
		if (root == null)
			return 0;
		if (root == node1 || root == node2) {
			return root.key;
		}
		if (root.key == node1.key) {
			return root.key;
		}
		if (root.key == node2.key) {
			return root.key;
		}
		int left = lowestCommonAncestor(root.left, node1, node2);
		int right = lowestCommonAncestor(root.right, node1, node2);
		if (left != 0 && right != 0)
			return root.key;
		if (left != 0)
			return left;
		if (right != 0)
			return right;
		return 0;

	}

	// Is Mirror Image

	// Top View Of Bin Tree

	// Distance K from Root

	// IsIdentical Trees

	// Size OF Tree

	// Count Leaf

	// Level Finder

	// First Non matching leave of BT. DFT with Stacks
	public int[] firstPairNoMatchingLeave(TreeNode r1, TreeNode r2) {
		if (r1 == null || r2 == null) {
			return new int[] { -1, -1 };
		}
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		// Push into Stack to reach leaf Node
		getLeaves(r1, stack1);
		getLeaves(r2, stack2);

		// Get Leaf
		TreeNode leaf1 = getLeaf(stack1);
		TreeNode leaf2 = getLeaf(stack2);
		while (leaf1 != null && leaf2 != null) {
			if (leaf1.key != leaf2.key) {
				return new int[] { leaf1.key, leaf2.key };
			}
			leaf1 = getLeaf(stack1);
			leaf2 = getLeaf(stack2);
		}

		return null;
	}

	private TreeNode getLeaf(Stack<TreeNode> tree) {

		while (!tree.isEmpty()) {

			TreeNode curr = tree.pop();

			if (curr.left == null && curr.right == null) {

				return curr;

			} else if (curr.right != null) {

				getLeaves(curr.right, tree);

			}

		}

		return null;

	}

	private void getLeaves(TreeNode root, Stack<TreeNode> stack) {
		while (root != null) {
			stack.add(root);
			root = root.left;
		}

	}

	// Count Half Nodes
	public static int getHalfNodes(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int count = 0;
		while (!q.isEmpty()) {
			TreeNode curr = q.poll();
			if ((curr.left != null && curr.right == null) || (curr.left == null && curr.right != null)) {
				count++;
			}
			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}

		}
		return count;
	}

	// Print only full Node
	public static void printFullNode(TreeNode root) {
		if (root == null) {
			return;
		}
		printFullNode(root.left);
		if (root.left != null && root.right != null) {
			System.out.println(root.key);
		}
		printFullNode(root.right);

	}

}
