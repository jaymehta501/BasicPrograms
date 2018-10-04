package trees;

public class SpiralForm {

	// Function to print the spiral traversal of tree
	void printSpiral(TreeNode node) {
		int h = height(node);
		int i;

		/*
		 * ltr -> left to right. If this
		 * variable is set then the
		 * given label is transversed
		 * from left to right
		 */
		boolean ltr = false;
		for (i = 1; i <= h; i++) {
			printGivenLevel(node, i, ltr);

			/*
			 * Revert ltr to traverse
			 * next level in opposite
			 * order
			 */
			ltr = !ltr;
		}

	}

	/*
	 * Compute the "height" of a tree --
	 * the number of nodes along the
	 * longest path from the root node
	 * down to the farthest leaf node.
	 */
	int height(TreeNode node) {
		if (node == null)
			return 0;
		else {

			/*
			 * compute the height of
			 * each subtree
			 */
			int lheight = height(node.left);
			int rheight = height(node.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	/* Print nodes at a given level */
	void printGivenLevel(TreeNode node, int level, boolean ltr) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.key + " ");
		else if (level > 1) {
			if (ltr != false) {
				printGivenLevel(node.left, level - 1, ltr);
				printGivenLevel(node.right, level - 1, ltr);
			} else {
				printGivenLevel(node.right, level - 1, ltr);
				printGivenLevel(node.left, level - 1, ltr);
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
		rootNode.left = rootNode1;
		rootNode.right = rootNode2;
		rootNode1.left = rootNode3;
		rootNode1.right = rootNode4;
		rootNode2.left = rootNode5;
		rootNode2.right = rootNode5;
		SpiralForm sf = new SpiralForm();
		sf.printSpiral(rootNode);
		System.out.println();
		System.out.println("Practice");
		Practice.printZigZag(rootNode);
	}

}
