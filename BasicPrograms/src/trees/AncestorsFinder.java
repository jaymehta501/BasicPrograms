package trees;

public class AncestorsFinder {

	/*
	 * If target is present in tree, then prints the ancestors and returns true,
	 * otherwise returns false.
	 */
	boolean printAncestors(TreeNode node, int target) {
		/* base cases */
		if (node == null)
			return false;

		if (node.key == target)
			return true;

		/*
		 * If target is present in either left or right subtree of this node,
		 * then print this node
		 */
		if (printAncestors(node.left, target) || printAncestors(node.right, target)) {
			System.out.print(node.key + " ");
			return true;
		}

		/* Else return false */
		return false;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		AncestorsFinder ac = new AncestorsFinder();
		ac.printAncestors(root, 5);

	}

}
