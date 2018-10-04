package trees;

public class IdenticalTrees {

	TreeNode root1;

	TreeNode root2;

	boolean isIdenticalTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}

		if (root1 != null && root2 != null) {
			return ((root1.key == root2.key) && isIdenticalTrees(root1.left, root2.left) && isIdenticalTrees(root1.right, root2.right));

		}
		return false;
	}

	public static void main(String[] args) {

		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);

		IdenticalTrees identicalTrees = new IdenticalTrees();

		System.out.println(identicalTrees.isIdenticalTrees(tree, tree));

	}

}
