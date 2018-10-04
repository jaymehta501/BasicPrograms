package trees;

public class LevelFinder {

	/*
	 * Helper function for getLevel(). It returns level of the data if data is
	 * present in tree, otherwise returns 0.
	 */
	int getLevelUtil(TreeNode node, int data, int level) {
		if (node == null)
			return 0;

		if (node.key == data)
			return level;

		int downlevel = getLevelUtil(node.left, data, level + 1);
		if (downlevel != 0)
			return downlevel;

		downlevel = getLevelUtil(node.right, data, level + 1);
		return downlevel;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		LevelFinder lf = new LevelFinder();
		System.out.println(lf.getLevelUtil(root, 5, 1));
	}

}
