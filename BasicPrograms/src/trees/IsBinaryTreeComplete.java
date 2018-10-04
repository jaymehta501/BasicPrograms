package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Approache 1 but all tree has to be
 * traverse h = Height of Tree n =
 * Number of nodes in the Tree if(n =
 * 2^h -1) return true else return false
 * 
 * Approach 2 with queue Time Complexity
 * is O(n) Space Complexity is O(n) 1.
 * Do Breadth First Traverse with queue
 * 2. Take global flag to detect if both
 * child are present or not 3. Check if
 * both childs are present to root and
 * add left and right to queue, return
 * false if both child are not seen 4.
 * If missing right child set global
 * flag to true and add left child into
 * queue 5. If missing left child set
 * global flag to true and add right
 * child into queue
 * 
 * 
 *
 */
public class IsBinaryTreeComplete {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		root.left = root1;
		root.right = root2;
		root1.left = root3;
		root1.right = root4;
		// true case
		System.out.println(isCompleteBinaryTree(root));
		root2.left = root5;
		// false case
		System.out.println(Practice.isCompleteBinaryTree(root));

	}
	//Approach 2

	public static boolean isCompleteBinaryTree(TreeNode root) {
		if (root == null) {
			return true;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		boolean bothChildNotSeen = false;
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode currentNode = queue.remove();
			// if both child null
			if ((currentNode.left == null) && (currentNode.right == null)) {
				if (bothChildNotSeen)
					return false;
			}
			// If it has two childs
			if ((currentNode.left != null) && (currentNode.right != null)) {

				if (bothChildNotSeen) {
					return false;
				}
				queue.add(currentNode.left);
				queue.add(currentNode.right);
			}
			// If missing right child
			if ((currentNode.left != null) && (currentNode.right == null)) {
				if (bothChildNotSeen) {
					return false;
				}
				bothChildNotSeen = true;
				queue.add(currentNode.left);
			}
			// If missing leftChild
			if ((currentNode.left == null) && (currentNode.right != null)) {
				if (bothChildNotSeen) {
					return false;
				}
				bothChildNotSeen = true;
				queue.add(currentNode.right);
			}

		}

		return true;
	}

}
