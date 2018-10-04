package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthOrLevelOrderTravese {

	void printLevelOrder(TreeNode node) {
		Queue<TreeNode> queue = new LinkedList();
		if (node != null) {
			queue.add(node);
		}

		while (!queue.isEmpty()) {

			TreeNode current = (TreeNode) queue.remove();
			System.out.println(current.key);

			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}

		}

	}

	public static void main(String[] args) {
		TreeNode rootNode = new TreeNode(1);
		TreeNode rootNode1 = new TreeNode(2);
		TreeNode rootNode2 = new TreeNode(3);
		TreeNode rootNode3 = new TreeNode(4);
		TreeNode rootNode4 = new TreeNode(5);
		TreeNode rootNode5 = new TreeNode(6);
		BreadthOrLevelOrderTravese obj = new BreadthOrLevelOrderTravese();
		rootNode.left = rootNode1;
		rootNode.right = rootNode2;
		rootNode1.left = rootNode3;
		rootNode1.right = rootNode4;
		rootNode2.left = rootNode5;
		rootNode2.right = rootNode5;

		obj.printLevelOrder(rootNode);

	}

}
