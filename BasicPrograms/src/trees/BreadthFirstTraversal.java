package trees;

import java.util.LinkedList;
import java.util.Queue;

import trees.BinaryTree;
import trees.BinaryTreeCreation;
import trees.TreeNode;

/**
 * Time Complexity is O(n) because we are visiting each node Space complexity is
 * O(n) because this is binary tree & in worst case we have to hold all elements
 * in the queue
 * 
 * 
 *
 */
public class BreadthFirstTraversal {
	public static void main(String[] args) {
		TreeNode rootNode = BinaryTreeCreation.createBinaryTree();
		BreadthFirstTraversal bfs = new BreadthFirstTraversal();
		bfs.levelOrderQueue(rootNode);
	}

	/**
	 * BFS or Level Order Traversal
	 */
	public void levelOrderQueue(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<BinaryTree.TreeNode>();
		if (null == root)
			return;
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode treeNode = (TreeNode) q.remove();
			System.out.println("" + treeNode.getData());
			if (null != treeNode.getLeft()) {
				q.add(treeNode.getLeft());
			}
			if (null != treeNode.getRight()) {
				q.add(treeNode.getRight());
			}

		}

	}

}
